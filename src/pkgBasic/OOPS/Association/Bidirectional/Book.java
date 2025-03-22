package pkgBasic.OOPS.Association.Bidirectional;

public class Book {

    private String title;
    private Library library;

    public Book(String title, Library library) {
        this.title = title;
        this.library = library;
    }

    public void showLibrary() {
        System.out.println(title+" is in "+library.getName());
    }

    public String getTitle() {
        return title;
    }
    public Library library() {
        return library;
    }
}
