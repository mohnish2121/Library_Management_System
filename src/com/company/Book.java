package com.company;

public class Book{
    String bookName;
    int id;
    Book( String bookName , int id ) {
        this.bookName = bookName;
        this.id = id;
    }
    String getBookName() {
        return bookName;
    }
    int getId() {
        return id;
    }
}
