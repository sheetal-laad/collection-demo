
public class Book {
	private int bId;
	private String name;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", name=" + name + "]";
	}
	

}
