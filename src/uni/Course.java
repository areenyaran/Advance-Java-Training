package uni;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String courseCode;
    private final String title;
    private final String instructor;
    private final int maxCapacity;
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

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
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
