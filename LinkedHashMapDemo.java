import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class LinkedHashMapDemo {
	
	
	public static List<Integer> mapToList(Map<Integer,String> map)
	{
		Collection<Integer> collect=map.keySet();
		ArrayList<Integer> ar=new ArrayList<Integer>(collect);
		
		return ar;
		
	}
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	    map.put(10, "abc");
	    map.put(212, "xyz");
	    map.put(17, "qwe");
	    map.put(1, "nmh");
	    map.put(15, "abc");
	    Set<Map.Entry<Integer,String>> map1=map.entrySet();
	    for(Map.Entry<Integer, String> m:map1)
	    	System.out.println(m.getKey()+"  : "+m.getValue());
	  
	    //convert map to list
	    List<Integer> list=mapToList(map);
	    
	    //sort map in ascending order
	    for(int i=0;i<list.size();i++)
	    {
	    	for(int j=i+1;j<list.size();j++)
	    	{
	    		if(list.get(i)>list.get(j))
	    		{
	    			int temp=list.get(i);
	    			list.set(i, list.get(j));
	    			list.set(j, temp);
	    		}
	    	}
	    }
	    
	    //after sorting a map
	    for(Integer i:list)
	    	System.out.println(i+" :"+map.get(i));

	}



}
