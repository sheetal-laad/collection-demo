import java.util.ArrayList;
import java.util.List;

public interface Component {
void showPrice();
}
class Leaf implements Component
{
String name;
double price;
	public Leaf(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}
	@Override
	public void showPrice() {
		System.out.println(name +" : "+price);
		
	}
	
}
class Composite implements Component
{
	String name;
    public Composite(String name) {
		super();
		this.name = name;
	}
    List<Component> list=new ArrayList<>();
    public void addComponent(Component comp)
    {
    	list.add(comp);
    }
	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component c:list)
			c.showPrice();
		
	}
}
