import uni.*;

public class Main {
    public static void main(String[] args) {
        EnrollmentManager university = new EnrollmentManager("Najah");
        StudentReport studentReportGenerator = new StudentReport();
        CourseReport courseReportGenerator = new CourseReport();

        Student student1 = new Student(12112181, "Areen A Shamasni", "areenahmad138@example.com");
        Student student2 = new Student(11712181, "Malek A Shamasni", "malekshamasni138@example.com");

        Course course1 = new Course("10672205", "Advanced topics in software development", "Dr. Mustafa Assaf", 30);
        Course course2 = new Course("10672110", "Introduction to probability theory", "Dr. Ayser Armiti", 40);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addCourse(course1);
        university.addCourse(course2);

        university.enrollStudentInCourse(student1, course1);
        university.enrollStudentInCourse(student2, course1);
        university.enrollStudentInCourse(student2, course2);

        university.generateAllReports();

        studentReportGenerator.generateReport(student2);
        university.dropStudentFromCourse(student2, course2);
        studentReportGenerator.generateReport(student2);

        courseReportGenerator.generateAllCoursesReport(university);
        courseReportGenerator.generateReport(course1);
    }
}
