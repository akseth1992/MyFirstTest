import java.util.Scanner;

public class Even_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//Using scanner for input
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			if(i%2==0)
				System.out.println(i+"");	
	}

}

