import java.util.Scanner;

public class gradearray
 {
    public static void main(String[] args) {
        int[][] grades = new int[5][2];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            grades[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            grades[i][1] = scanner.nextInt();
        }
        
        printGrades(grades);
        calculateAndPrintAverages(grades);
        
        scanner.close();
    }
    public static void printGrades(int[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }
    
    
    public static void calculateAndPrintAverages(int[][] grades) {
        int totalMath = 0;
        int totalScience = 0;
        
        for (int i = 0; i < grades.length; i++) {
            totalMath += grades[i][0];
            totalScience += grades[i][1];
        }
        
        double averageMath = (double) totalMath / grades.length;
        double averageScience = (double) totalScience / grades.length;
        
        System.out.println("Average Math Grade: " + String.format("%.2f", averageMath));
        System.out.println("Average Science Grade: " + String.format("%.2f", averageScience));
    }
}