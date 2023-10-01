package uni;

public class StudentReport implements ReportGenerator<Student> {

    public void generateReport(Student student) {
        System.out.println("Student Report:\n"+ student.getStudentId() + " - " + student.getName() + " - " + student.getEmail());
        System.out.println("The enrolled Courses for " + student.getName() + " are:");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course.getCourseCode() + " - " + course.getTitle());
        }
        System.out.println("-------------------------------");
    }
}


