import java.util.LinkedHashSet;
import java.util.TreeSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"abc");
		Employee e2=new Employee(2,"xyz");
		Employee e3=new Employee(3,"pqr");
		Employee e4=new Employee(4,"xyz");
		LinkedHashSet<Employee> ts2=new LinkedHashSet<Employee>();
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		System.out.println("--------------------------");
		for(Employee e:ts2)
			System.out.println(e);
		
		

	}

}
