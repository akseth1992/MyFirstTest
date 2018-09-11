import java.util.Scanner;

public class SumOfEvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long esum=0,osum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while (num!=0){
			int digit=num%10;
			if (digit%2==0)
				esum=esum+digit;
			else
				osum=osum+digit;
			    num=num/10;
		}
		System.out.println("Sum of Even Digit:"+esum);
		System.out.println("Sum of Odd Digit:"+osum);
	}

}
