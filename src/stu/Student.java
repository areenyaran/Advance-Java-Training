package stu;

import courses.Course;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int studentId;
    private final String name;
    private final String email;
    private final List<Course> enrolledCourses;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        if (enrolledCourses.contains(course)) {
            System.out.println("Student is already enrolled in the course.");
        } else if (course.getCurrentEnrollment() >= course.getMaxCapacity()) {
            System.out.println("Course is full.");
        } else {
            enrolledCourses.add(course);
            course.addStudent(this);
        }
    }

    public void dropCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            System.out.println("Student is not enrolled in the course.");
        } else {
            enrolledCourses.remove(course);
            course.removeStudent(this);
        }
    }
}