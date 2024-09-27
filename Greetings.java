import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] students = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        greetStudents(students);

        scanner.close();
    }

    public static void greetStudents(String[] students) {
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }
}