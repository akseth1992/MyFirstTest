

public class Case_Alphabet {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a character ");
		char ch=(char)System.in.read();
		if(ch>=65 && ch<=90)
			System.out.println("Character is Upper case:"+ch);
		else if(ch>=97 && ch<=122)
			System.out.println("Character is Lower case:"+ch);
		else if(ch>=48 && ch<=57)
			System.out.println("Character is Digit:"+ch);
		else
			System.out.println("Character is Special Character:"+ch);
	}

}
