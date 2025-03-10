package com.P.IteratorPattern.EG1Libary.Library;

import com.P.IteratorPattern.EG1Libary.Book;
import com.P.IteratorPattern.EG1Libary.Library.Aggerate;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggerate {

    private List<Book> bookList;

//    CONSTRUCTOR
    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
