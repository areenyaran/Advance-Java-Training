package uni;

import courses.Course;
import stu.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<Student> students;
    private final List<Course> courses;

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void generateAllCoursesReport() {
        System.out.println("All available courses in the university:");
        for (Course course : courses) {
            System.out.println(course);
        }
        System.out.println("-------------------------------");
    }

    public void generateStudentCoursesReport(Student student) {
        System.out.println("Courses in which student " + student.getName() + " is enrolled:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course);
        }
        System.out.println("-------------------------------");
    }

    public void generateCourseStudentsReport(Course course) {
        System.out.println("Students enrolled in course " + course.getTitle() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student);
        }
        System.out.println("-------------------------------");
    }

    public void generateAllReports() {
        System.out.println("All Reports");
        generateAllCoursesReport();
        for (Student student : students) {
            generateStudentCoursesReport(student);
        }
        for (Course course : courses) {
            generateCourseStudentsReport(course);
        }
    }
}
