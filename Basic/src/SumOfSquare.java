import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while (num!=0){
			int digit=num%10;
			sum=sum+(digit*digit);
			num=num/10;
		}
		System.out.println("Sum of Square of each Digit is:"+sum);
	}
}
