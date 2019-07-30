
public class FactoryDemo {
	public Os getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else
			return new Windows();
	}
	
	
	

}
