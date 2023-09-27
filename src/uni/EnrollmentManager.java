package uni;

public class EnrollmentManager extends University {

    public EnrollmentManager(String uniName) {
        super(uniName);
    }

    public void enrollInCourse(Student student, Course course) {
            student.getEnrolledCourses().add(course);
            course.addStudent(student);
    }

    public void dropCourse(Student student, Course course) {
            student.getEnrolledCourses().remove(course);
            course.removeStudent(student);
    }

    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        if (student == null || course == null) {
            System.out.println("Student or course not found.");
            return;
        }

        if (course.getCurrentEnrollment() >= course.getMaxCapacity()) {
            System.out.println("Course is full, you cannot enroll any student.");
            return;
        }

        if (student.getEnrolledCourses().contains(course)) {
            System.out.println("Student is already enrolled in this course.");
            return;
        }

        enrollInCourse(student, course);
        course.addStudent(student);
    }

    @Override
    public void dropStudentFromCourse(Student student, Course course) {
        if (student == null || course == null) {
            System.out.println("Student or course not found.");
            return;
        }

        if (!(student.getEnrolledCourses().contains(course))) {
            System.out.println("Student is not enrolled in the course.");
            return;
        }

        dropCourse(student, course);
        course.removeStudent(student);
    }
}
