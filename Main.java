
public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(
            501,
            "John Smith",
            "john@university.edu",
            "Computer Engineering"
        );

        Student student = new Student(
            1001,
            "Alex Brown",
            "alex@student.edu",
            3.45
        );

        Course course = new Course(
            "CENG201",
            "Object Oriented Programming",
            instructor
        );

        Enrollment enrollment = new Enrollment(student, course);

        System.out.println("=== STUDENT INFORMATION ===");
        student.displayDetails();

        System.out.println("\n=== INSTRUCTOR INFORMATION ===");
        instructor.displayDetails();

        System.out.println("\n=== COURSE INFORMATION ===");
        course.displayCourse();

        System.out.println("\n=== ENROLLMENT INFORMATION ===");
        enrollment.displayEnrollment();

        enrollment.assignGrade(92);

        System.out.println("\n=== UPDATED ENROLLMENT ===");
        enrollment.displayEnrollment();

        student.setGpa(3.70);

        System.out.println("\n=== UPDATED STUDENT GPA ===");
        System.out.println("New GPA: " + student.getGpa());

        System.out.println("\n=== POLYMORPHISM ===");

        Person[] people = {student, instructor};

        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }
    }
}
