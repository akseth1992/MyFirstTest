import java.util.Scanner;

public class Natural_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++)
				System.out.println(i+"");
		}
		
		
	}

}
