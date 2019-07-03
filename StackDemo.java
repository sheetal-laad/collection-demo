import java.util.Iterator;
import java.util.Stack;


public class StackDemo {

	public static  void main(String[] args) {
		Stack st=new Stack();
		st.add(325);
		st.add(56);
		st.push(567);
		st.push(34);
		st.pop();
		st.remove(0);
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		

	}

}
