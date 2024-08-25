package ArrayList;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class Map_interface_EntrySet_Iterator {

	public static void main(String[] args) 
	
	{
		Map<String, Integer> m1 = new IdentityHashMap<String, Integer>();
		
		m1.put("Ashu_Mobile_Number", 8104848);
		m1.put("Nakshu_Mobile_Number", 986575);
		
		Iterator<Entry<String, Integer>> kv =m1.entrySet().iterator();
		
		while(kv.hasNext()) {
			
			System.out.println(kv.next());
			
			
			
			
			
		}
	
		

	}

}
