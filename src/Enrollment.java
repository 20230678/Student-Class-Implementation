public class Enrollment {
    private final Student student;
    private final Course course;
    private Double grade;

    public Enrollment(Student student, Course course) {
        if (student == null || course == null) {
            throw new IllegalArgumentException("Student and course cannot be null.");
        }
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public boolean hasGrade() {
        return grade != null;
    }

   
    public double getGrade() {
        if (grade == null) {
            throw new IllegalStateException("Grade has not been assigned yet.");
        }
        return grade;
    }

    public void assignGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade. It must be between 0 and 100.");
        }
        this.grade = grade;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Grade: " + (hasGrade() ? grade : "Not assigned"));
    }
}
