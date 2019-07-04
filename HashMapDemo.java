import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("name","sheetal");
		hm.put("age","23");
		System.out.println(hm);
		System.out.println(hm.get("name"));
		
		//show values using keyset
		Set<String> s=hm.keySet();
		for(String s1:s)
			System.out.println(hm.get(s1));
		
		   //to get size of map
		System.out.println("size of map is"+hm.size());
		
		
	    //to modify existing value
	    System.out.println(hm.replace("name","sheetal","sarthak"));
	    
	    
	  //get key and values using entry set
	  		Set<Map.Entry<String,String>> values=hm.entrySet();
	  		for(Map.Entry<String,String> e:values )
	  			System.out.println(e.getKey()+" =="+e.getValue());
	  		
	  		//to merge 2 map
	  		Map<String,String> hm2=new HashMap<String,String>();
	  		hm2.put("semester", "8th");
	  		hm2.put(null, null);
	  		hm2.put(null, null);
	  		hm.putAll(hm2);
	  		
	  		System.out.println("---------------------------------------");
	  		Set<Map.Entry<String,String>> values1=hm.entrySet();
	  		for(Map.Entry<String,String> e:values1 )
	  			System.out.println(e.getKey()+" =="+e.getValue());
	  			
	  		
	}

}
