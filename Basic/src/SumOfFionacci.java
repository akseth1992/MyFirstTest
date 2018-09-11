import java.util.Scanner;

public class SumOfFionacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Sum of First 10 fibonacci Number***\n");
		int a=0;
		int b=1;
		int sum=a+b;
		int c=a+b;
		for(int i=3;i<=10;i++){
		c=a+b;
		a=b;
		b=c; 
		sum=sum+c;
		}
		System.out.println(sum);
	}
}
