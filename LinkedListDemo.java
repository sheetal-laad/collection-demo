import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(12);
		list1.add(78);
		list1.add(3);
		list1.add(35);
		list1.add(120);
		list1.addFirst(0);
		list1.addLast(1000);
		for(int i:list1)
			System.out.println(i);
		//sorting Listlist
				for(int j=0;j<list1.size();j++)
				{
					for(int i = j+1;i<list1.size();i++)
					{
						if(list1.get(j)>list1.get(i))
						{
							int temp=list1.get(i);
							list1.set(i,list1.get(j));
							list1.set(j,temp);
						}
					}
				}
				System.out.println("after sorting");
				for(int j:list1)
					System.out.println(j);
		
		
		
		

	}

}
