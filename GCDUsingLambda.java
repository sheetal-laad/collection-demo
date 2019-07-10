import java.util.Scanner;
import java.math.BigInteger;


public class GCDUsingLambda {
	interface GcdDemo
	{
		int calculateGcd(int num1,int num2);
	}
	interface LcmDemo
	{
		int calculateLcm(int num1,int num2);
	}
    public static void main(String[] args)
    {
	GcdDemo demo=(n1,n2)->{ while(n1!=n2)
	{
		if(n1>n2)
			n1-=n2;
		else
			n2-=n1;
	}
	return n1;
	};
	
	LcmDemo lcm=(n1,n2)-> n1*n2/demo.calculateGcd(n1, n2);
	
	
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("gcd of " + n1 +"and "+n2 +" is " +demo.calculateGcd(n1, n2));
	System.out.println("lcm of " + n1 +"and "+n2 +" is " +lcm.calculateLcm(n1, n2));
}

 

}
