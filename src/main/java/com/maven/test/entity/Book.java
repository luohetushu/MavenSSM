package com.maven.test.entity;

public class Book {
    //DESC book;
    //+---------+-------------+------+-----+---------+----------------+
    //| Field   | Type        | Null | Key | Default | Extra          |
    //+---------+-------------+------+-----+---------+----------------+
    //| book_id | int(20)     | NO   | PRI | NULL    | auto_increment |
    //| name    | varchar(20) | NO   |     | NULL    |                |
    //| number  | int(11)     | NO   |     | NULL    |                |
    //+---------+-------------+------+-----+---------+----------------+
    private long bookId;
    private String name;
    private int number;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
