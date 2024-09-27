import java.util.Scanner;
class py{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number of level for pyramid: ");
		int n=scanner.nextInt();
		int spaces=n;
		for(int i=1;i<=n;i++){
			for(int s=1;s<=spaces;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
				
			}
			spaces--;
                        System.out.println();
		}
	}
}