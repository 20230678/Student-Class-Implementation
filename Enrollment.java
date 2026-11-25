
public class Enrollment {
    private Student student;
    private Course course;
    private double grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.grade = -1;
    }

    public void assignGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. It must be between 0 and 100.");
        }
    }

    public void displayEnrollment() {
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());

        if (grade == -1) {
            System.out.println("Grade: Not assigned");
        } else {
            System.out.println("Grade: " + grade);
        }
    }
}
