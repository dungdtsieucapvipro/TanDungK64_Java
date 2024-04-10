package BaiTap.school;

public class Course {
    private String name;
    private String course_ID;
    private Instructor instructor;

    public Course(String name, String course_ID, Instructor instructor) {
        this.name = name;
        this.course_ID = course_ID;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
