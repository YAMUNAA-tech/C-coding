import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store scores
        int[][] scores = new int[3][4];

        // Get scores from user input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter scores for Student " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // Calculate average scores for each student
        double[] studentAverages = calculateStudentAverages(scores);

        // Calculate average scores for each subject
        double[] subjectAverages = calculateSubjectAverages(scores);

        // Print average scores
        printAverageScores(studentAverages, subjectAverages);

        scanner.close();
    }

    // Calculate average scores for each student
    public static double[] calculateStudentAverages(int[][] scores) {
        double[] averages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int score : scores[i]) {
                sum += score;
            }
            averages[i] = (double) sum / scores[i].length;
        }
        return averages;
    }

    // Calculate average scores for each subject
    public static double[] calculateSubjectAverages(int[][] scores) {
        double[] averages = new double[scores[0].length];
        for (int i = 0; i < scores[0].length; i++) {
            int sum = 0;
            for (int[] studentScores : scores) {
                sum += studentScores[i];
            }
            averages[i] = (double) sum / scores.length;
        }
        return averages;
    }

    // Print average scores
    public static void printAverageScores(double[] studentAverages, double[] subjectAverages) {
        System.out.println("Average scores for each student:");
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.printf("Student %d: %.1f\n", i + 1, studentAverages[i]);
        }
        System.out.println("Average scores for each subject:");
        String[] subjects = {"Math", "Science", "English", "History"};
        for (int i = 0; i < subjectAverages.length; i++) {
            System.out.printf("%s: %.1f\n", subjects[i], subjectAverages[i]);
        }
    }
}
