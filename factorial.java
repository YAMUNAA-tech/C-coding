import java.util.Scanner;
class factorial{
    public static void main(String[]args)
    {
        Scanner fact = new Scanner(System.in);
        int n = fact.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println(f);
    }
    
}