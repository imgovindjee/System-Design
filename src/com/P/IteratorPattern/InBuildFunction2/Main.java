package com.P.IteratorPattern.InBuildFunction2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
          new Book(100, "ASD"),
          new Book(200, "RAMAYAN"),
          new Book(340, "MyLOVE") ,
          new Book(102, "BHAGWAT GEETA")
        );

        Iterator<Book> bookIterator = bookList.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println("----------------------------------------------" +
                    "\nBook Name: "+book.getBookName()+
                    "\nPrice: "+book.getPrice());
        }
    }
}
