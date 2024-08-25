package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_ContainKey {

	public static void main(String[] args) 
	
	{
Map<String, String> m1 = new HashMap<String, String>();
		
		m1.put("Ashu", "patlashu@122");
		m1.put("vicky", "vicky@123");
		m1.put("nakshu", "nakshu@122");
		System.out.println(m1);
		System.out.println(m1.containsKey("Manish"));
		
Map<String, Integer> m2 = new HashMap<String, Integer>();
		
		m2.put("Ashu", 23);
		m2.put("vicky", 65);
		m2.put("nakshu", 32);
		System.out.println(m1);
		System.out.println(m2.containsValue(23));
		System.out.println(m2.equals(m1));
		


	}

}
