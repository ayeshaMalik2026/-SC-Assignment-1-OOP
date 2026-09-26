public class Book {
    // Encapsulate fields by making them private
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters for read access
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Business Logic: Handles state change safely inside the Book class
    public boolean borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true; // Successfully borrowed
        }
        return false; // Already borrowed
    }

    public void returnBook() {
        this.isBorrowed = false;
    }
}