
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a and b value");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Before swap\na="+a+"\nb="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swap\na="+a+"\nb="+b);
	}

}
