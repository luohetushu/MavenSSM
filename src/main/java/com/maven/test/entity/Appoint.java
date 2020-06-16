package com.maven.test.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Appoint {
    private long bid;
    private long sid;
    private Date appointTime;

    private Book book;

    //多对一
    private List<Book> books;

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "AppointBook{" +
                "bid=" + bid +
                ", sid=" + sid +
                ", appointTime=" + new SimpleDateFormat("yyyy-MM-dd HH:ss:mm").format(appointTime) +
                '}';
    }
}
