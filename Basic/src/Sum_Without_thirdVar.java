import java.util.Scanner;

public class Sum_Without_thirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two no. to be added");
int a=sc.nextInt();
int b=sc.nextInt();
int carry;

while(b!=0){
	carry=a&b;
	a=a^b;
	b=carry<<1;
}
System.out.println("Sum is:"+a);
	}


}
