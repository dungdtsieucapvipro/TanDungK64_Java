package BaiTap.library;
import java.time.LocalDate;

public class Borrow {
    private String borrowId;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrow(String borrowId, Book book, Member member) {
        this.borrowId = borrowId;
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.returnDate = null;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public boolean isOverdue() {
        LocalDate dueDate = borrowDate.plusDays(14); //

        if (returnDate == null) {
            return LocalDate.now().isAfter(dueDate);
        } else {
            return returnDate.isAfter(dueDate);
        }
    }
}
