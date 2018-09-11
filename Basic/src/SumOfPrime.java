import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Sum Of Prime Number upto 100 Number ***\n");
		int limit=100;
		int sum=0;
		for(int num=1;num<=limit;num++){
		boolean flag=true;
		for (int i=2;i<num;i++){
		if (num%i==0){
			flag=false;
			break;
				}
			}
		if(flag)
			sum=sum+num;
		}
		System.out.println(sum);
		
	}
	}

