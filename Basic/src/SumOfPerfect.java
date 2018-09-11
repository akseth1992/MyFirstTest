import java.util.Scanner;

public class SumOfPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Sum of Perfect no.upto 10000***\n");
		int limit=10000;
		int total=0;
		for(int num=1;num<=limit;num++){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num){
			//System.out.println(num+"");
		total=total+sum;
			
		}
	}
		System.out.println(total);	
}
}
