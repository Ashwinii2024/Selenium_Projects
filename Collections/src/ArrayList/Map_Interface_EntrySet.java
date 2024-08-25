package ArrayList;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Interface_EntrySet 

{

	public static void main(String[] args) 
	
	{
		Map<String ,Integer> m1 = new IdentityHashMap<String ,Integer>();
		
		m1.put("Ram", 51);
		m1.put("Sita", 45);
		m1.put("Lakshman", 50);
		System.out.println(m1);
		
		for( Entry<String ,Integer>KV:m1.entrySet())
			System.out.println(KV);
		{
			
		}
	}

}
