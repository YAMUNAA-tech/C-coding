import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private static int totalStudentsEnrolled = 0;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        totalStudentsEnrolled++;
    }

    public static int getTotalStudentsEnrolled() {
        return totalStudentsEnrolled;
    }
}

class Course {
    private String title;
    private String code;
    private static int totalCoursesOffered = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCoursesOffered++;
    }

    public static int getTotalCoursesOffered() {
        return totalCoursesOffered;
    }
}

public class UniversityStudentManagementSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter name and ID for Student 1:");
        Student student1 = new Student(scanner.nextLine(), scanner.nextLine());

        System.out.println("Enter name and ID for Student 2:");
        Student student2 = new Student(scanner.nextLine(), scanner.nextLine());

        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled());

        
        System.out.println("Enter title and code for Course 1:");
        Course course1 = new Course(scanner.nextLine(), scanner.nextLine());

        System.out.println("Enter title and code for Course 2:");
        Course course2 = new Course(scanner.nextLine(), scanner.nextLine());

        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered());

        
        System.out.println("Enter name and ID for Student 3:");
        Student student3 = new Student(scanner.nextLine(), scanner.nextLine());

        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled());
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered());

        
        System.out.println("No new enrollments or offerings.");
        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled());
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered());

        scanner.close();
    }
}