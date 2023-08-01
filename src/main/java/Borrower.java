import java.util.ArrayList;

public class Borrower {
    private final ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public void borrowBook(Book book, Library library) {
        if (library.countBooks() > 0) {
            collection.add(book);
            library.removeBook(book);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("No books available to borrow.");
        }
    }

    public void displayCollection() {
        System.out.println("Borrower's Collection:");
        for (Book book : collection) {
            System.out.println(book);
        }
    }
}
