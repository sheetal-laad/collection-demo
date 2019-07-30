import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
private String name;
private List<Book> books=new ArrayList<>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "BookShop [name=" + name + ", books=" + books + "]";
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
public void BookLoad()
{
	for(int i=1;i<=10;i++)
	{
		Book b1=new Book();
		b1.setbId(i);
        b1.setName("book"+i);
		getBooks().add(b1);
	}
}
@Override 
protected BookShop clone() throws CloneNotSupportedException {
	BookShop bs =new BookShop();
	for(Book b:this.getBooks())
	{
		bs.getBooks().add(b);
	}
	return bs;
}


}
