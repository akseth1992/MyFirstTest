import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<num;i++){
		if (num%i==0){
			flag=false;
			break;
				}
			}
		if(flag)
		System.out.println("Number "+num+" is Prime");
		else
			System.out.println("Number "+num+" is not Prime");
	}
}
