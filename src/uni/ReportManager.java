package uni;

import java.util.List;

public class ReportManager {
    public void generateAllReports(University university) {
        System.out.println("All Reports :");

        CourseReport courseReportGenerator = new CourseReport();
        StudentReport studentReportGenerator = new StudentReport();
        courseReportGenerator.generateAllCoursesReport(university);

        for (Student student : university.getStudents()) {
            studentReportGenerator.generateReport(student);
        }
        for (Course course : university.getCourses()) {
            courseReportGenerator.generateReport(course);
        }
    }

}
