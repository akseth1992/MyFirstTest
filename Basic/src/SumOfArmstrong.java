import java.io.IOException;

public class SumOfArmstrong {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("\n***Sum Of Armstrong No.upto 1000 Number***\n");
		int limit=1000;
		int total=0;
		for(int num=2;num<=limit;num++){
		int sum=0,num1=num;
		while (num1!=0){
			int digit=num1%10;
			sum=sum+(digit*digit*digit);
			num1=num1/10;
		}
		if(sum==num)
			total=total+sum;
		}
		System.out.println(total);
	}
}

