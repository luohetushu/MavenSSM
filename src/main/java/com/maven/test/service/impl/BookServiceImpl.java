package com.maven.test.service.impl;

import com.maven.test.dao.AppointDao;
import com.maven.test.dao.BookDao;
import com.maven.test.dto.AppointExecution;
import com.maven.test.entity.Appoint;
import com.maven.test.entity.Book;
import com.maven.test.enums.AppointStateEnum;
import com.maven.test.exception.AppointUnknownException;
import com.maven.test.exception.NoNumberException;
import com.maven.test.exception.RepeatAppointException;
import com.maven.test.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointDao appointDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getBooks() {
        return bookDao.queryAll(0, 1000);
    }

    @Override
    public List<Book> getStudentBooks(long studentId) {
        try {
            Appoint appoint = appointDao.queryByKeyWithBooks(studentId);
            if (appoint != null){
                return appoint.getBooks();
            }
        } catch (Exception e){
            // 所有编译期异常转换为运行期异常
            throw new AppointUnknownException("预约未知错误: " + e.getMessage());
        }
        return null;
    }

    @Override
    public AppointExecution appoint(long bookId, long studentId) {

        try {
            //如果预约成功则减少库存
            int update = bookDao.reduceNum(bookId);
            if (update <= 0){  // 库存不足
                throw new NoNumberException("库存不足");
            } else {
                // 执行预约操作
                int insert = appointDao.insertAppoint(bookId, studentId);
                if (insert <= 0){
                    throw new NoNumberException("重复预约");
                } else { // 预约成功
                    Appoint appoint = appointDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appoint);
                }
            }
        } catch (NoNumberException nne){
            throw nne;
        } catch (RepeatAppointException rae){
            throw rae;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            throw new AppointUnknownException("预约未知错误: " + e.getMessage());
        }
    }
}
