import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Enter a number***\n");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
			System.out.println("Number "+num+" is Perfect no.");
		else
			System.out.println("Number "+num+" is not Perfect no.");
}
}
