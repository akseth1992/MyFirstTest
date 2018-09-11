import java.util.Scanner;

public class ArmstrongNoBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Armstrong between2-1000***\n");
		int limit=1000;
		for(int num=2;num<=limit;num++){
		int sum=0,num1=num;
		while (num1!=0){
			int digit=num1%10;
			sum=sum+(digit*digit*digit);
			num1=num1/10;
		}
		if(sum==num)
		System.out.println(num+"");
	}
}
}
