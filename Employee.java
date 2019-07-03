


public  class Employee implements Comparable {
public int eid;
public String ename;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "]";
}
public Employee(int eid2, String ename2) {
	// TODO Auto-generated constructor stub
	eid=eid2;
	ename=ename2;
}
public int compareTo(Employee o) {
	return ename.compareTo(o.ename);
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}
