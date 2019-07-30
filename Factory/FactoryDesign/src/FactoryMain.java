
public class FactoryMain {

	public static void main(String[] args) {
		FactoryDemo fd=new FactoryDemo();
		Os obj=fd.getInstance("close");
		obj.spec();

	}

}
