package pkgBasic.OOPS.Association.Bidirectional;

public class BidirectionalMesh {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        Book book1 = new Book("1984", library);
        Book book2 = new Book("Salaar", library);

        library.addBook(book1);
        library.addBook(book2);

        library.showBook();
        book1.showLibrary();
        book2.showLibrary();
    }
}
