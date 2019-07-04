import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int count=0;
		for(int index=0;index<name.length();index++)
		{
			if(Character.isDigit(name.charAt(index)))
			{
			count++;	
			}
		}
		System.out.println("number of digits in given string is:"+count);

	}

}
