package uni;

import java.util.List;

public class CourseReport implements ReportGenerator<Course> {
    public void generateReport(Course course) {
        System.out.println("Course " + course.getTitle() + " report: \n- Students enrolled in course " + course.getTitle() + ":");
        List<Student> enrolledStudents = course.getEnrolledStudents();
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled in this course.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println(student.getName() + " - " + student.getEmail());
            }
        }
        System.out.println("-------------------------------");
    }
    public void generateAllCoursesReport(University university) {
        System.out.println("All available courses in the university:");
        for (Course course : university.getCourses()) {
            System.out.println(course.getCourseCode() + " - " + course.getTitle());
        }
        System.out.println("-------------------------------");
    }

}
