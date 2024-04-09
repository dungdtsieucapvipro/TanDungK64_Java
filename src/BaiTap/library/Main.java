package BaiTap.library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo một thư viện mới
        Library library = new Library();

        // Thêm các sách vào thư viện
        Book book1 = new Book("B001", "Toán học tập 1", "Nguyễn Văn A", "111");
        Book book2 = new Book("B002", "Văn học châu Á", "Trần B", "112");
        Book book3 = new Book("B003", "Tiếng Anh cơ bản", "John Smith", "113");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Đăng ký thành viên mới
        Member member1 = new Member("M001", "Toàn", "toan@gmail.com");
        Member member2 = new Member("M002", "Việt", "viet@gmail.com");
        Member member3 = new Member("M003", "Cris", "cris@gmail.com");
        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);

        // Mượn sách
        library.borrowBook("B001", "M001"); // Alice mượn Java Programming
        library.borrowBook("B002", "M002"); // Bob mượn Python Basics
        library.borrowBook("B003", "M003"); // Charlie mượn JavaScript Essentials

        // Alice trả sách sau 10 ngày
        Member alice = library.findMemberById("M001");
        if (alice != null) {
            Book borrowedBook = library.findBookById("B001");
            if (borrowedBook != null) {
                alice.returnBook(borrowedBook);
            }
        }

        // Kiểm tra sách đã quá hạn chưa
        Borrow borrow = new Borrow("BR001", book2, member2);
        if (borrow.isOverdue()) {
            System.out.println("Sách " + book2.getTitle() + " đã quá hạn.");
        } else {
            System.out.println("Sách " + book2.getTitle() + " chưa quá hạn.");
        }

        // In ra thông tin mượn sách của các thành viên
        System.out.println("Thông tin mượn sách của các thành viên:");
        for (Member member : library.getMembers()) {
            System.out.println("Thành viên: " + member.getName());
            System.out.println("Email: " + member.getEmail());

            System.out.println("Sách đã mượn:");
            for (Book book : member.getBooksBorrowed()) {
                System.out.println("- " + book.getTitle() + " (Tác giả: " + book.getAuthor() + ")");
            }

            System.out.println(); // In một dòng trống để phân tách các thành viên
        }
    }
}
