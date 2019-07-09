import java.util.Scanner;
interface LambdaDemo
{
	void palindromDemo(String s);
}

public class PalindromDemo {
	

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
	 LambdaDemo lambdaFunc=(String s)->{
		 char a[]=s.toCharArray();
		 int j=a.length-1;
		 int flag=0;
		 for(int i=0;i<a.length;i++)
		  {
			if(a[i]==a[j])
				j--;
			else 
			{
				flag=1;
			}
		  }
		 if(flag==0)
			 System.out.println(s+"   is palindrom string");
		 else
			 System.out.println(s+"   is not palindrom string");
		 };	 
	 lambdaFunc.palindromDemo(name);
	 

	}

}
