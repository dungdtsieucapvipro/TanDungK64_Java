package BaiTap.library;
import java.time.LocalDate;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    protected boolean available;

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean checkAvailability() {
        return available;
    }
}
