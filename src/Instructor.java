public class Instructor extends Person {
    private final int instructorId;
    private final String department;

    public Instructor(int instructorId, String name, String email, String department) {
        super(name, email);
        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.instructorId = instructorId;
        this.department = department;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
    }
}
