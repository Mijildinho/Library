package lab1;

/**
 * A representation of a library of books.
 *
 * @author mingjiehuang 
 */
public class Library {

    // Create two libraries 
    String address;
    java.util.ArrayList<Book> books;

    public static final String openingTime = "9am";
    public static final String closingTime = "5pm";

    public Library(String libraryAddress) {
        address = libraryAddress;
        books = new java.util.ArrayList<>();

    }
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St.");

    public void addBook(Book book) {
        // Create two libraries

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
    }

    public static void printOpeningHours() {
        System.out.println("Library hours:");
        
        System.out.println();
    }

    public void printAddress() {
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
    }

    public void borrowBook(String title) {
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
    }

    public void printAvailableBooks() {
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
    }

    public void returnBook(String title) {
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
