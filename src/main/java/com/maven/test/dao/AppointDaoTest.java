package com.maven.test.dao;

import com.maven.test.BaseTest;
import com.maven.test.entity.Appoint;
import com.maven.test.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointDaoTest extends BaseTest {

    @Autowired
    private AppointDao appointDao;

    @Test
    public void testInsertAppoint(){
        long bookId = 1000;
        long bookId2 = 1004;
        long studentId = 1000000L;
        int insert = appointDao.insertAppoint(bookId, studentId);
        System.out.println("insert=" + insert);
        int insert2 = appointDao.insertAppoint(bookId2, studentId);
        System.out.println("insert=" + insert2);
    }

    @Test
    public void testQueryByKeyWithBook(){
        long bookId = 1000;
        long studentId = 1000000L;
        Appoint appoint = appointDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appoint);
        System.out.println(appoint.getBook());
    }

    @Test
    public void testQueryByKeyWithBooks(){
        long studentId = 1000000L;
        Appoint appoint = appointDao.queryByKeyWithBooks(studentId);
        System.out.println(appoint);
        List<Book> books = appoint.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
