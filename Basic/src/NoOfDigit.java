import java.util.Scanner;

public class NoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println("\n***Individual Digit of a Number is***\n");
		while (num!=0){
			int digit=num%10;
			System.out.println(digit);
			num=num/10;
		}
	}

}
