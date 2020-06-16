package com.maven.test.service.impl;

import com.maven.test.dao.AppointDao;
import com.maven.test.dao.BookDao;
import com.maven.test.dto.AppointExecution;
import com.maven.test.entity.Book;
import com.maven.test.exception.NoNumberException;
import com.maven.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointDao appointDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
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

            }
        } catch (NoNumberException nne){
            throw nne;
        }

        return null;
    }
}
