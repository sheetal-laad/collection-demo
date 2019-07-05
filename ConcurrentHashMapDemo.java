import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap map=new ConcurrentHashMap();
		map.put(1,"maths");
		map.put(2, "secienc");
		map.put(3,"english");
		map.putIfAbsent(4,"hindi");
		
		map.replace(2,"secienc","social science");
		Set<Map.Entry> m=map.entrySet();
		for(Map.Entry  m1: m)
			System.out.println(m1.getKey()+"  :" +m1.getValue());
	}

}
