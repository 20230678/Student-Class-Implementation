public class Student {


    private int studentId;
    private String name;
    private String surname;
    private int age;
    private String department;
    private double gpa;

 
    public Student(int studentId, String name, String surname,
                   int age, String department, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }

  
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

 
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

   
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
    }

   
    public boolean isSuccessful() {
        return gpa >= 2.0;
    }
}
