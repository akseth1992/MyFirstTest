import java.util.Scanner;

public class FibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***First 10 fibonacci Number***\n");
		int a=0;
		int b=1;
		System.out.println(a+""+b+"");
		int c=a+b;
		for(int i=3;i<=10;i++){
		c=a+b;
		a=b;
		b=c; 
		System.out.println(c+"");
		}
	}

}
