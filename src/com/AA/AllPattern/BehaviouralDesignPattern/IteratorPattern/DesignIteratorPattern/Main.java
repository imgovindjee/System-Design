package com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern;

import com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Iterator.Iterator;
import com.AA.AllPattern.BehaviouralDesignPattern.IteratorPattern.DesignIteratorPattern.Library.Library;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("ASD", 100),
                new Book("RAMAYAN", 200),
                new Book("MyLOVE", 340) ,
                new Book("BHAGWAT GEETA", 102)
        );

        Library lib = new Library(bookList);
        Iterator bookIterator = lib.createIterator();
        while(bookIterator.hasNext()) {
            Book book = (Book)bookIterator.next();
            System.out.println("Book name is: "+book.getBookName()+" Price: "+book.getPrice());
        }
    }
}
