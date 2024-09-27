import java.util.Scanner;

public class namearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        
        System.out.println("Enter the five names:");
        for (int i = 0; i < 5; i++) {

            names[i] = scanner.nextLine();
        }
        

        String longestName = names[0];
        String shortestName = names[0];
        
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
            if (names[i].length() < shortestName.length()) {
                shortestName = names[i];
            }
        }
        
    
        System.out.println("Longest name: " + longestName);
        System.out.println("Shortest name: " + shortestName);

        System.out.println("Names in reverse order:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+" ");
        }
    }
}