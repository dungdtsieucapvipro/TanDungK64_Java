package BaiTap.school;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private String student_ID;
    private List<Course> courses;

    public Student(String name, String student_ID) {
        this.name = name;
        this.student_ID = student_ID;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void enrol(Course course) {
        courses.add(course);
    }

    public void drop_course(Course course) {
        courses.remove(course);
    }

    public void transfer_credits(Course course1, Course course2) {
    }
}
