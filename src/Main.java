import courses.Course;
import stu.Student;
import uni.University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12112181, "Areen A Shamasni", "areenahmad138@example.com");
        Student student2 = new Student(11712181, "Malek A Shamasni", "malekshamasni138@example.com");

        Course course1 = new Course("10672205", "Advanced topics in software development ", "Dr. Mustafa Assaf", 30);
        Course course2 = new Course("10672110", "Introduction to probability theory", "Dr. Ayser Armiti", 40);
        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addCourse(course1);
        university.addCourse(course2);

        student1.enrollInCourse(course1);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course2);

        university.generateStudentCoursesReport(student2);
        student2.dropCourse(course2);
        university.generateStudentCoursesReport(student2);

        university.generateAllCoursesReport();
        university.generateCourseStudentsReport(course1);
        university.generateAllReports();

    }
}