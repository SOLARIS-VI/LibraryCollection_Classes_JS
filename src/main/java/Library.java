import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    public final ArrayList<Book> books;
    private final int capacity;
    private final HashMap<String, Integer> genreCount;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genreCount = new HashMap<>();
    }

    public int countBooks() {
        return books.size();
    }

    public boolean isStockFull() {
        return books.size() >= capacity;
    }

    public void addBook(Book book) {
        if (!isStockFull()) {
            books.add(book);
            updateGenreCount(book.getGenre(), 1); // Increment the genre count by 1
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Stock is full. Cannot add book: " + book.getTitle());
        }
    }

    private void updateGenreCount(String genre, int increment) {
        genreCount.put(genre, genreCount.getOrDefault(genre, 0) + increment);
    }

    public void removeBook(Book book) {
        books.remove(book);
        updateGenreCount(book.getGenre(), -1); // Decrement the genre count by 1
    }

    public void displayGenreCount() {
        System.out.println("Genre count:");
        for (String genre : genreCount.keySet()) {
            System.out.println(genre + ": " + genreCount.get(genre));
        }
    }
}
