import java.util.Scanner;

public class PrimeNoBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***Prime Number Between 1-100 Number ***\n");
		int limit=100;
		for(int num=1;num<=limit;num++){
		boolean flag=true;
		for (int i=2;i<num;i++){
		if (num%i==0){
			flag=false;
			break;
				}
			}
		if(flag)
		System.out.println(num+"");
		
	}
	}
}
