
public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setName("novelty");
		bs.BookLoad();
		System.out.println(bs);
		
		BookShop bs1=bs.clone();
		bs.getBooks().remove(2);
		bs1.setName("saclecha");
		System.out.println(bs1);

	}

}
