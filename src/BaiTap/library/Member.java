package BaiTap.library;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> booksBorrowed;

    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberID) {
        this.memberId = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(Book book) {
        if (book.checkAvailability()) {
            booksBorrowed.add(book);
            book.available = false;
            System.out.println("Đã mượn sách thành công!");
        } else {
            System.out.println("Sách không có sẵn để mượn");
        }
    }

    public void returnBook(Book book) {
        booksBorrowed.remove(book);
        book.available = true;
        System.out.println("Đã trả sách thành công!");
    }

}