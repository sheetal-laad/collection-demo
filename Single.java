class A
{
	private static A ob;
	private A()
	{
	}
	public static A getObject()
	{
		if(ob==null)
			ob=new A();
		return ob;
	}
	public void show()
	{
		System.out.println("we are in class A");
	}
}
public class Single {

	public static void main(String[] args) {
		A.getObject().show();

	}

}
