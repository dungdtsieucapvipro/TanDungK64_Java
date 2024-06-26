package BaiTap.school;
import java.util.ArrayList;
import java.util.List;
public class Instructor {
    private String name;
    private List<Course> courses;

    public Instructor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void add_course(Course course) {
        courses.add(course);
    }

    public void remove_course(Course course) {
        courses.remove(course);
    }
}
