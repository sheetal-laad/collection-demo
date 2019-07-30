
public class School {

	public static void main(String[] args) {
		Asiignment as=new Asiignment();
		Pen p=new PenAdapter(); 
		as.setP(p);
		as.WriteAssignment("assignment is on java technology");

	}

}
