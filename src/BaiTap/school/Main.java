package BaiTap.school;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Nguyễn Văn A");
        Instructor instructor2 = new Instructor("Nguyễn Thị B");

        Course mathCourse = new Course("Toán học 01", "TH01", instructor1);
        Course physicsCourse = new Course("Vật lý 01", "VL)!", instructor2);

        // Tạo các sinh viên
        Student student1 = new Student("Nguyễn Văn C", "SV01");
        Student student2 = new Student("Nguyễn Thị D", "SV02");

        student1.enrol(mathCourse);
        student2.enrol(physicsCourse);

        // In ra danh sách các sinh viên đã đăng ký khóa học
        System.out.println("Danh sách các sinh viên đã đăng ký khóa học:");
        System.out.println("Sinh viên 1: " + student1.getName() + ", ID: " + student1.getStudent_ID());
        System.out.println("Sinh viên 2: " + student2.getName() + ", ID: " + student2.getStudent_ID());

        // In ra danh sách các khóa học do giáo viên giảng dạy
        System.out.println("\nDanh sách các khóa học do giáo viên giảng dạy:");
        System.out.println("Giáo viên 1: " + instructor1.getName());
        for (Course course : instructor1.getCourses()) {
            System.out.println("   - " + course.getName() + " (ID: " + course.getCourse_ID() + ")");
        }
        System.out.println("Giáo viên 2: " + instructor2.getName());
        for (Course course : instructor2.getCourses()) {
            System.out.println("   - " + course.getName() + " (ID: " + course.getCourse_ID() + ")");
        }

        // Tạo các đối tượng Course khác
        Course course1 = new Course("Ngữ văn 01", "NV01", instructor1);
        Course course2 = new Course("Tiếng anh 01", "TA01", instructor2);

        // Tạo các đối tượng Sinh viên khác
        Student student3 = new Student("Trần Quốc E", "SV03");
        Student student4 = new Student("Lê Thị F", "SV04");

        // Sinh viên đăng ký các khóa học
        student3.enrol(course1);
        student3.enrol(course2);
        student4.enrol(course1);

        // In ra các khóa học của mỗi sinh viên
        System.out.println("\nDanh sách các sinh viên mới đăng ký khóa học:");
        System.out.println(student3.getName() + " đã đăng ký các khóa học:");
        for (Course course : student3.getCourses()) {
            System.out.println("   - " + course.getName() + " (ID: " + course.getCourse_ID() + ")");
        }

        System.out.println(student4.getName() + " đã đăng ký các khóa học:");
        for (Course course : student4.getCourses()) {
            System.out.println("   - " + course.getName() + " (ID: " + course.getCourse_ID() + ")");
        }
    }
}
