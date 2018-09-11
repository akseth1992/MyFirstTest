import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int rem= a-(a/b)*b;
		System.out.println("Remainder:"+rem);
	}
}
