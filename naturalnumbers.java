import java.util.Scanner;
class naturalnumbers{
    public static void main(String[] agrs){
        Scanner natural = new Scanner(System.in);
        int num=natural.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}