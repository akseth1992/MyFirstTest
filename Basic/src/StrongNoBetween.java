import java.util.Scanner;

public class StrongNoBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Strong no. between 1-100000***\n");
		int limit=100000;
		for(int num=1;num<=limit;num++){
		int sum=0;
		int num1=num;
		while(num1!=0){
			int digit=num1%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
				fact=fact*i;
			sum=sum+fact;
			num1=num1/10;
		}
		if(sum==num)
			System.out.println(num+"");
		
}
}
}
