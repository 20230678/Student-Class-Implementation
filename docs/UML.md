
# Student Management System - UML Class Diagram

```mermaid
classDiagram
    class Person {
        <<abstract>>
        -String name
        -String email
        +getName()
        +getEmail()
        +displayDetails()
    }

    class Student {
        -int studentId
        -double gpa
        +getStudentId()
        +getGpa()
        +setGpa()
        +displayDetails()
    }

    class Instructor {
        -int instructorId
        -String department
        +getInstructorId()
        +getDepartment()
        +displayDetails()
    }

    class Course {
        -String courseCode
        -String courseName
        -Instructor instructor
        +displayCourse()
    }

    class Enrollment {
        -Student student
        -Course course
        -double grade
        +assignGrade()
        +displayEnrollment()
    }

    Person <|-- Student
    Person <|-- Instructor
    Instructor "1" <-- "0..*" Course : teaches
    Student "1" <-- "0..*" Enrollment : registers
    Course "1" <-- "0..*" Enrollment : includes
```
