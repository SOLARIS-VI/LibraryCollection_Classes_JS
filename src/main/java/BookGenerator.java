import java.util.Random;

public class BookGenerator {
    private static final String[] TITLES = {
            "The Great Gatsby",
            "To Kill a Mockingbird",
            "1984",
            "Pride and Prejudice",
            "The Lord of the Rings",
            "The Catcher in the Rye",
            "Harry Potter and the Sorcerer's Stone",
            "Animal Farm",
            "Brave New World",
            "The Hobbit"
    };

    private static final String[] AUTHORS = {
            "F. Scott Fitzgerald",
            "Harper Lee",
            "George Orwell",
            "Jane Austen",
            "J.R.R. Tolkien",
            "J.D. Salinger",
            "J.K. Rowling",
            "George Orwell",
            "Aldous Huxley",
            "J.R.R. Tolkien"
    };

    private static final String[] GENRES = {
            "Classic",
            "Literary Fiction",
            "Science Fiction",
            "Romance",
            "Fantasy",
            "Coming-of-Age",
            "Fantasy",
            "Dystopian",
            "Dystopian",
            "Fantasy"
    };

    private static final Random random = new Random();

    public static Book generateRandomBook() {
        int index = random.nextInt(TITLES.length);
        return new Book(TITLES[index], AUTHORS[index], GENRES[index]);
    }
}
