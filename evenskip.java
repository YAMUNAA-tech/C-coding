import java.util.Scanner;
class evenskip{
    public static void main(String[]agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            continue;
            System.out.print(i+"");
        }
    }
}