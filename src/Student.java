
public class Student extends Person {
    private int studentId;
    private double gpa;

    public Student(int studentId, String name, String email, double gpa) {
        super(name, email);
        this.studentId = studentId;
        setGpa(gpa);
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. It must be between 0.0 and 4.0.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("GPA: " + gpa);
    }
}
