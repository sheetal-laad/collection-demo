import java.util.Scanner;


public class NewCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char name1[]=name.toCharArray();
		int index[]=new int[256];
		for(int i=0;i<name1.length;i++)
		{
			int count=1;
			if(index[(int)name1[i]] !=0)
				continue;
			for(int j=i+1;j<name1.length;j++)
			{
				if(name1[i]==name1[j])
				{
					index[(int)name1[i]]++;
					count++;
				}
			}
			System.out.println(name1[i]+"    appears for " +count +"  times");
		}

	}

}
