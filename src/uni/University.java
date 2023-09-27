package uni;

import java.util.ArrayList;
import java.util.List;

public abstract class University {
    private final String uniName;
    private final List<Student> students;
    private final List<Course> courses;

    public University(String uniName) {
        this.uniName = uniName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public abstract void enrollStudentInCourse(Student student, Course course);
    public abstract void dropStudentFromCourse(Student student, Course course);
    public void generateAllReports() {
        ReportManager reportManager = new ReportManager();
        reportManager.generateAllReports(this);
    }

}
