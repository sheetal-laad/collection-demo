import java.util.Vector;


public class VectorDemo {

	public static void main(String[] args){
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(13);
		v1.add(45);
		v1.add(786);
		v1.add(657);
		v1.remove(0);
		System.out.println(v1.capacity());
		for(int i:v1)
			System.out.println(i);
		
		
		
		
		

	}

}
