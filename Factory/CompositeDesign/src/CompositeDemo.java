
public class CompositeDemo {

	public static void main(String[] args) {
	
         Component ram=new Leaf("Ram",3000);
         Component mouse=new Leaf("mouse",300);
         Component kb=new Leaf("keyboard",300);
         Component cpu=new Leaf("cpu",9000);
         Component monitor=new Leaf("monitor",7000);
         
         Composite peri=new Composite("peri");
         Composite mb=new Composite("motherboard");
         Composite computer=new Composite("computer");
         
         peri.addComponent(mouse);
         peri.addComponent(kb);
         peri.addComponent(monitor);
         
         mb.addComponent(ram);
         mb.addComponent(cpu);
         
         computer.addComponent(peri);
         computer.addComponent(mb);
         
         computer.showPrice();
	}

}
