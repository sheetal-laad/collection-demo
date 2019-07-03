import java.util.Scanner;


public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char name1[]=name.toCharArray();
		int index[]=new int[26];
		int x=0;
	//	for(char c:name1)
		//	System.out.println(c);
		for(int i=0;i<name1.length;i++)
		{
			if(name1[i]>='a' && name1[i]<='z')
			{
				x=name1[i]-'a';
                index[x]++;
			}

		}
	for(int i=0;i<26;i++)
	{
		if(index[i]==0)
			continue;
	
			System.out.println((char)(97+i)+"   occurs  "+index[i]+"   times  ");
	}
	}

}
