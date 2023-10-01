# Student Enrollment System

## Overview

This Java program implements a Student Enrollment System for a university. It allows you to manage students, courses, enrollments, and generate reports. In this README, we will provide an overview of the classes, methods, and changes made to meet the assignment requirements.

## Classes and Components

### Student

The `Student` class represents individual students and includes the following properties:

- Student ID
- Name
- Email
- List of enrolled courses

### Course

The `Course` class represents university courses and includes the following properties:

- Course Code
- Title
- Instructor
- Maximum Capacity
- List of enrolled students

### University

The `University` class serves as the central component for managing students and courses, It includes the following methods:

- `getName()`: Returns the name of the university.
- `setName(String name)`: Sets the name of the university.
- `getStudents()`: Returns a list of all students in the university.
- `getCourses()`: Returns a list of all courses offered by the university.
- `addStudent(Student student)`: Adds a student to the university.
- `addCourse(Course course)`: Adds a course to the university.
- `enrollStudentInCourse(Student student, Course course)`: Enrolls a student in a course.
- `dropStudentFromCourse(Student student, Course course)`: Drops a student from a course.
  these two abstract methods will be overrided in the EnrollmentManager methodes that will manage the enrollment logic.
- `generateAllReports()`: Generates comprehensive reports for the university by the report manager class.

### Report Generator

You have implemented a `ReportGenerator` class that implements an interface with methods to generate reports. This class contains the logic for generating the reports for the student and courses by override the generateReport methode from this interface ( if the reports are similar in idea, perhaps we could write an advanced methode ).

- `void generateReport(T entity)`: takes a generic type T as a parameter, This allows it to generate reports for different types of entities, making it versatile for our reporting needs.

## Enrollment Management

### Enrollment Manager Class

The `EnrollmentManager` class is responsible for managing student enrollments and course drops within the Student Enrollment System. It serves as a critical component for ensuring that students can enroll in courses and that course capacities are properly maintained.

- enrollStudentInCourse(Student student, Course course): Enrolls a student in a course, considering course capacity and enrollment status.
- dropStudentFromCourse(Student student, Course course): Drops a student from a course, ensuring they are enrolled before removal.

## Encapsulation, Cohesion, and Coupling

- I ensured proper encapsulation by making class fields private and providing getter and setter methods where necessary. This enhances data integrity and security.

- The classes are designed with proper cohesion, with each class having a well-defined purpose. The `University` class handles university-level operations, the `Student` class represents student-specific data, and the `Course` class represents course-specific data.

- To achieve loose coupling, we made sure that classes communicate through well-defined interfaces and methods, reducing dependencies between classes.

## Demo Application

A demo application (e.g., a Main class) has been created to showcase the functionality of the Student Enrollment System. In the demo, you can:

- Create instances of students and courses.
- Add students and courses to the university.
- Enroll students in courses.
- Drop students from courses.
- Generate various reports to demonstrate the system's capabilities.

## Conclusion

This Student Enrollment System has been designed and implemented to meet the assignment requirements, emphasizing object-oriented programming principles, encapsulation, cohesion, and loose coupling between classes. The demo application provides a practical demonstration of its functionality.
