package ArrayList;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class Map_Interface_EntrySet_Iteration {

	public static void main(String[] args) 
	
	{
	Map<String,Double>m1 =	new WeakHashMap<String,Double>();
	m1.put("Ashu", 34500.54);
	m1.put("nakshu", 635500.54);
	m1.put("raju", 76500.54);
	m1.put("Vicky",98500.54);
	System.out.println(m1);
	
	Map<String,Double>m2 =	new WeakHashMap<String,Double>();
	m2.put("Kanhu", 4500.54);
	m2.put("xyz",87.087);
	m2.putAll(m1);
	
	System.out.println(m2);
	
	for(Entry<String,Double> kv:m2.entrySet())
	{
		System.out.println(kv);
	}
	
	
	

	}

}
