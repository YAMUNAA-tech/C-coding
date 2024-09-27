import java.util.Scanner;
class studentarray{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] mark=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Scores"+(i+1)+":");
            mark[i]=scan.nextInt();
        }
        System.out.print("Scores:");
        for(int i=0;i<5;i++)
        {
        System.out.print(mark[i]+" ");
        }
        int max=mark[0];
        int min=mark[0];
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]>max)
            {
                max=mark[i];
            }
            if(mark[i]<min)
            {
                min=mark[i];
            }
        }  
        int sum=0;
        for(int i=0;i<mark.length;i++)
        {
            sum=sum+mark[i];
        }
        double avg=(double)sum/mark.length;
        System.out.println("Average:"+avg);
        System.out.println("Highest score:"+max);  
        System.out.println("Lowest score:"+min);      
        
    }
}