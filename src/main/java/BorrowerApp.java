public class BorrowerApp {
    public static void main(String[] args) {
        
        // Set the library capacity to 5
        Library library = new Library(5);

        // Add 5 random books to the library
        for (int i = 0; i < 5; i++) {
            Book book = BookGenerator.generateRandomBook();
            library.addBook(book);
        }

        // Display the count of books for each genre in the library
        library.displayGenreCount();

        // Create a new Borrower
        Borrower borrower = new Borrower();

        // Borrow two books from the library and add them to the borrower's collection
        borrower.borrowBook(library.books.get(0), library);
        borrower.borrowBook(library.books.get(1), library);

        // Display the collection of books the borrower has borrowed
        borrower.displayCollection();

        // Display the updated genre count in the library after books were borrowed
        library.displayGenreCount();
    }
}
