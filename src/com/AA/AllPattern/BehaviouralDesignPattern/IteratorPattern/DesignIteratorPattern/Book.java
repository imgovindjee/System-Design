package com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern;

public class Book {
    private String bookName;
    private int price;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }
}
