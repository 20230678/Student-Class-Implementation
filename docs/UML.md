# Student Management System - UML Class Diagram

```mermaid
classDiagram
    class Person {
        <<abstract>>
        -String name
        -String email
        +getName() String
        +getEmail() String
        +displayDetails()* void
    }

    class Student {
        -int studentId
        -double gpa
        +getStudentId() int
        +getGpa() double
        +setGpa(double) void
        +displayDetails() void
    }

    class Instructor {
        -int instructorId
        -String department
        +getInstructorId() int
        +getDepartment() String
        +displayDetails() void
    }

    class Course {
        -String courseCode
        -String courseName
        -Instructor instructor
        +getCourseCode() String
        +getCourseName() String
        +getInstructor() Instructor
        +displayCourse() void
    }

    class Enrollment {
        -Student student
        -Course course
        -Double grade
        +getStudent() Student
        +getCourse() Course
        +hasGrade() boolean
        +getGrade() double
        +assignGrade(double) void
        +displayEnrollment() void
    }

    Person <|-- Student
    Person <|-- Instructor
    Instructor "1" <-- "0..*" Course : teaches
    Student "1" <-- "0..*" Enrollment : registers
    Course "1" <-- "0..*" Enrollment : includes
```
