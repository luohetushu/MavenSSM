package com.maven.test.service.impl;

import com.maven.test.BaseTest;
import com.maven.test.dto.AppointExecution;
import com.maven.test.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint(){
        long bookId = 1003;
        long studentId = 1000000L;
        AppointExecution appointExecution = bookService.appoint(bookId, studentId);
        System.out.println(appointExecution);
    }

}
