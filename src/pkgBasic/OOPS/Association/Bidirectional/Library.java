package pkgBasic.OOPS.Association.Bidirectional;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> bookList;

    public Library(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void showBook() {
        System.out.println("Books in "+name+": ");
        for (Book bl:bookList){
            System.out.println(" - "+bl.getTitle());
        }
    }
}
