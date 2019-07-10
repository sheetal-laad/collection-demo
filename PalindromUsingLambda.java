import java.util.Scanner;


public class PalindromUsingLambda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Palindrome pal=(s)-> { if(new StringBuilder(s).reverse().toString().equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		};
		pal.palindromCheck(name);
		
		
		
		
		
	}
	interface Palindrome
	{
		void palindromCheck(String s);
	}
}
