// make online library
// make online library
// methods : isuue book,add book, returnbook, show available books
// properties: Array to store available books , array to store the issued books
import java.util.ArrayList;

class OnlineLibrary {
    // Properties
    private ArrayList<String> availableBooks; // Array to store available books
    private ArrayList<String> issuedBooks;    // Array to store issued books

    // Constructor
    public OnlineLibrary() {
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(String book) {
        availableBooks.add(book);
        System.out.println("Book \"" + book + "\" added to the library.");
    }

    // Method to issue a book
    public void issueBook(String book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            issuedBooks.add(book);
            System.out.println("Book \"" + book + "\" has been issued.");
        } else {
            System.out.println("Sorry, the book \"" + book + "\" is not available.");
        }
    }

    // Method to return a book
    public void returnBook(String book) {
        if (issuedBooks.contains(book)) {
            issuedBooks.remove(book);
            availableBooks.add(book);
            System.out.println("Book \"" + book + "\" has been returned.");
        } else {
            System.out.println("This book was not issued.");
        }
    }

    // Method to show available books
    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (String book : availableBooks) {
                System.out.println(book);
            }
        }
    }

    // Main method to test the library system
    public static void main(String[] args) {
        OnlineLibrary library = new OnlineLibrary();
        
        // Add some books
        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");
        
        // Show available books
        library.showAvailableBooks();
        
        // Issue a book
        library.issueBook("Java Programming");
        
        // Show available books after issuing one
        library.showAvailableBooks();
        
        // Return the book
        library.returnBook("Java Programming");
        
        // Show available books after returning one
        library.showAvailableBooks();
    }
}
