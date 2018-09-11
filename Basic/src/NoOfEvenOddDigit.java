import java.util.Scanner;

public class NoOfEvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long edigit=0,odigit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while (num!=0){
			int digit=num%10;
			if (digit%2==0)
				edigit++;
			else
				odigit++;
			    num=num/10;
		}
		System.out.println("Total no. of Even Digit:"+edigit);
		System.out.println("Total no. of Odd Digit:"+odigit);
	}

}
