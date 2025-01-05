package com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Library;

import com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Book;
import com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Iterator.BookIterator;
import com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Iterator.Iterator;

import java.util.List;

//public class Library implements Aggerate {
public class Library {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
