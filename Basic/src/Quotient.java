import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. for Division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int quotient=0;
		
		while(a>=b){
			a-=b;
			quotient++;
		}
		System.out.println("Quotient is:"+quotient);
	}

}
