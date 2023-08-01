# Library Collection - Java Classes - Homework

This project simulates a low-scale library system, managing basic library functions such as borrowing, adding, and removing books. It consists of three main classes: Book, Library, and Borrower.

## Book

- Represents a book and holds information about its title, author, and genre.
- To create a new book, provide these details using the constructor.
- Separate methods allow you to get the title, author, and genre of a book.
- The `toString()` method displays the book information in a user-friendly way.

## Library

- Represents the library itself, capable of holding a collection of books with a specific capacity (the maximum number of books it can hold).
- Utilizes a `genreCount` variable, functioning like a dictionary to keep track of how many books are there for each genre.

### Methods

- `countBooks()`: Get the total number of books in the library.
- `isStockFull()`: Check if the library is full and cannot take more books.
- `addBook(Book book)`: Add a book to the library collection and update the genre count.
- `updateGenreCount(String genre, int increment)`: A private method to change the count of books for a specific genre.
- `removeBook(Book book)`: Remove a book from the library and update the genre count accordingly.
- `displayGenreCount()`: Display the count of books for each genre in the library.

## Borrower

- Represents a person who can borrow books from the library.
- Maintains a collection of books (`collection`) that the borrower borrows from the library.

### Methods

- `borrowBook(Book book, Library library)`: Borrow a book from the library and add it to the borrower's collection.
- `displayCollection()`: Display the collection of books the borrower has borrowed.

## BookGenerator

- A utility class to create random books.
- Contains a method called `generateRandomBook()`, which randomly picks a title, author, and genre from predefined lists and creates a new Book with those details.

## BorrowerApp

- The main class of the program where everything starts.
- Creates a Library with a capacity of 5 (maximum 5 books).
- Uses the BookGenerator to create 5 random books and adds them to the library.
- Displays the library's genre count.
- Creates a Borrower and allows them to borrow two books from the library.
- Displays the borrower's collection.
- Shows the library's genre count again, updated after the books were borrowed.

In summary, this code simulates a simple library system where books can be added, removed, and borrowed by a borrower. It demonstrates how classes can interact with each other, how objects store data, and how utility classes can generate random data. When you run the program, you'll see the library's status and how the borrower interacts with it. It's a neat example of using Java classes, objects, and collections to build a functional program.
