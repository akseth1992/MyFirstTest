import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++)
				sum=sum+i;	
		}
		System.out.println("Sum of first "+n+" Natural no is:"+sum);
		
	}

}
	


