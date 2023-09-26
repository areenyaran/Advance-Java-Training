package uni;

import java.util.List;

public class ReportManager {
    public void generateAllReports(University university, List<Student> students, List<Course> courses) {
        System.out.println("All Reports :");

        CourseReport courseReportGenerator = new CourseReport();
        StudentReport studentReportGenerator = new StudentReport();
        courseReportGenerator.generateAllCoursesReport(university);

        for (Student student : students) {
            studentReportGenerator.generateReport(student);
        }
        for (Course course : courses) {
            courseReportGenerator.generateReport(course);
        }
    }

}
