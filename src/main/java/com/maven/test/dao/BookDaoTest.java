package com.maven.test.dao;

import com.maven.test.BaseTest;
import com.maven.test.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById(){
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll(){
        List<Book> books = bookDao.queryAll(0, 5);
        for (Book book : books){
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNum(){
        long bookId = 1000;
        int result = bookDao.reduceNum(bookId);
        System.out.println("update=" + result);  // 1
    }


}
