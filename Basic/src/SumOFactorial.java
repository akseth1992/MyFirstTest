import java.util.Scanner;

public class SumOFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int factsum=0;
		while(num!=0)
		{
			int fact=1;
			int digit=num%10;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
				factsum=factsum+fact;
				num=num/10;
			}
			
		}
		System.out.println("Sum of Factorial of Individual digit is:"+factsum);
	}
}
