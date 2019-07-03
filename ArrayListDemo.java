import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ar1=new ArrayList();//arraylist without generics
		ar1.add(12);
		ar1.add(23);
		ar1.add(null);
		ar1.add("abc");
		System.out.println(ar1);
		System.out.println("element at 0th index is:"+ar1.get(0));
		ar1.remove(0);
		System.out.println(ar1);
		ar1.add(1,"xyz");
		System.out.println(ar1);
		//display using for loop
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		//arraylist with generics
			ArrayList<Integer> ar2=new ArrayList<Integer>();
			ar2.add(12);
			ar2.add(13);
			ar2.add(1248);
			ar2.add(123);
			ar2.add(122);
		for(int j:ar2)
			System.out.println(j);
		//sorting arraylist
		for(int j=0;j<ar2.size();j++)
		{
			for(int i = j+1;i<ar2.size();i++)
			{
				if(ar2.get(j)>ar2.get(i))
				{
					int temp=ar2.get(i);
					ar2.set(i,ar2.get(j));
					ar2.set(j,temp);
				}
			}
		}
		System.out.println("after sorting");
		for(int j:ar2)
			System.out.println(j);
		//using AddAll() function
          ArrayList<Integer> ar3=new ArrayList<Integer>();
          ar3.add(67);
          ar3.add(897);
          ar2.addAll(ar3);
          System.out.println("--------------------");
          for(int i:ar2)
        	  System.out.println(i);
	}

}
