

public class InterfaceDemo1 implements Demo1 {
	public void show()
	{
		System.out.println("demo for the interface");
	}

	public static void main(String[] args) {
	Demo1 ob=new InterfaceDemo1();
	ob.show();

	}

}
