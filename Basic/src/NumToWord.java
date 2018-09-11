import java.util.Scanner;

public class NumToWord 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		String msg="";
		while (num!=0)
		{
			int rem=num%10;
			switch(rem)
			{
			case 0:msg="Zero"+msg;break;
			case 1:msg="One"+msg;break;
			case 2:msg="Two"+msg;break;
			case 3:msg="Three"+msg;break;
			case 4:msg="Four"+msg;break;
			case 5:msg="Five"+msg;break;
			case 6:msg="Six"+msg;break;
			case 7:msg="Seven"+msg;break;
			case 8:msg="Eight"+msg;break;
			case 9:msg="Nine"+msg;break;
			}
			num=num/10;
		}
		System.out.println(msg);	

	}
}