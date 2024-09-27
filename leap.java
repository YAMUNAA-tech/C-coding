import java.util.Scanner;
class leap{
   public static void main(String[] args){
        Scanner leapyear=new Scanner(System.in);
        int year=leapyear.nextInt();
        if (year%4==0 || year%400==0)
           System.out.println("The given year is leap year ");
        else if(year%100!=0)
           System.out.println("The given year is not leap year ");
        else
           System.out.println("invalid syntax");
}
     }
     

      
   