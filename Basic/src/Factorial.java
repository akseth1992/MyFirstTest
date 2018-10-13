import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();//Using scanner Function
		int fact=1;
			for(int i=num;i>0;i--)
			{
				fact=fact*i;
			}
			
		System.out.println("Factorial of "+num+" is:"+fact);
	}
}
