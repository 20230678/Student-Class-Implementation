
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
            1001, "Alex", "Johnson",
            21, "Computer Engineering", 3.45
        );

        Student student2 = new Student(
            1002, "Emma", "Brown",
            22, "Software Engineering", 1.85
        );

        System.out.println("STUDENT 1");
        student1.displayInfo();

        System.out.println("Successful: " +
                           student1.isSuccessful());

        System.out.println("\n--------------------\n");

        System.out.println("STUDENT 2");
        student2.displayInfo();

        System.out.println("Successful: " +
                           student2.isSuccessful());
    }
}
