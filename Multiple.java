import java.util.Random;
import java.util.Scanner;
class Multiple{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Multiplication Practice Program!");
        while(true){
          int num1=random.nextInt(1,10);
          int num2=random.nextInt(1,10);
          int multiplication=(num1*num2);
          System.out.println("What is "+num1+ " * "+num2+"?");
          System.out.println("Enter your answer (or 0 to exit ) : ");
          int userans=scanner.nextInt();
          if (userans==0)
          {
            System.out.println("Thank you for practicing multiplication!");
            break;
          }
            
          else if(userans==multiplication)
          {
            System.out.println("Correct!");
          }
          else
          {
            System.out.println("Incorrect. The correct answer is"+ multiplication);
          }
        }
        scanner.close();
    }
  }
