import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Enter a Number***\n");
		int num=sc.nextInt();
		int sum=0,num1=num;
		while (num!=0){
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(sum==num1)
		System.out.println("Number "+num1+" is Armstrong no.");
		else
			System.out.println("Number "+num1+" is not Armstrong no.");
	}
}
