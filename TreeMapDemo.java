import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	     map.put(6, "raj");
	     map.put(1,"sheetal");
	     map.put(2,"ankita");
	     map.put(3,"sarthak");
	     map.put(4, "ravi");
	     
	     map.replace(3," sarthak", "himanshu");
	     
	     //display values
	     Set<Map.Entry<Integer,String>> map1=map.entrySet();
	     for(Map.Entry<Integer, String> m:map1)
	    	 System.out.println(m.getKey()+":  "+m.getValue());
	     
	     

	}

}
