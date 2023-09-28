package uni;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String title;
    private String instructor;
    private int maxCapacity;
    private final List<Student> enrolledStudents;

    public Course(String courseCode, String title, String instructor, int maxCapacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public int getCurrentEnrollment() {
        return enrolledStudents.size();
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
