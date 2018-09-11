import java.util.Scanner;

public class SumOfEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			if(i%2==0)
				sum=sum+i;
				System.out.println("Sum of first "+n+" Even Number is:"+sum);	
	}

}


