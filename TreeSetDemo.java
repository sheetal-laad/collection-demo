import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(23);
		ts.add(5674);
		ts.add(32);
		ts.add(8756);
		ts.add(23415);
		ts.add(12);
		
		ts.remove(12);
		
		TreeSet ts1=new TreeSet();
		ts1.add(545);
		ts1.add(56748);
		
		ts.addAll(ts1);
		System.out.println(ts);
		

	}

}
