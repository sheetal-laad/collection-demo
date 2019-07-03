import java.util.HashSet;
import java.util.Iterator;


public class SetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(34);
		hs.add(56);
		hs.add("abc");
		hs.add(12.5);
		hs.add(34);
		hs.add(null);
		hs.add(null);
		hs.remove(34);
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	   
	}

}
