package com.P.IteratorPattern.EG1Libary;

import com.P.IteratorPattern.EG1Libary.Iterator.BookIterator;
import com.P.IteratorPattern.EG1Libary.Iterator.Iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(100, "ASD"),
                new Book(200, "RAMAYAN"),
                new Book(340, "MyLOVE") ,
                new Book(102, "BHAGWAT GEETA")
        );

        Iterator bookIterator = new BookIterator(bookList);
        while (bookIterator.hasNext()) {
            Book book =(Book)bookIterator.next();
            System.out.println("----------------------------------------------" +
                    "\nBook Name: "+book.getBookName()+
                    "\nPrice: "+book.getPrice());
        }
    }
}
