package Java_Assignments;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Map_Interface_Methods_Assignment111 {

	public static void main(String[] args) 
	
	{
		
		//put method
				Map m1 = new HashMap();
				m1.put("Ram", 51);
				m1.put("Sita", 45);
				m1.put("Lakshman", 50);
			
				System.out.println(m1);
				//putAll method
				Map m2 = new HashMap();
				m2.put("Raj", 34);
				m2.put("Rani", 43);
				System.out.println(m2);
				m2.putAll(m1);
				System.out.println(m2);
				
				//Clear Method
				Map m3 = new HashMap();
				m3.put("ashu", 29);
				m3.put("Vicky", 26);
				System.out.println(m3);
				m3.clear();
				System.out.println(m3);
				
				//putIfAbsent
				
				Map m4 = new HashMap();
				m4.put("ashu", 29);
				m4.put("Vicky", 26);
				System.out.println(m4);
				m4.putIfAbsent("xyz",23);
				System.out.println(m4);
				//containsKey AND containsValue
		Map<String, String> m5 = new HashMap<String, String>();
				
		m5.put("Ashu", "patlashu@122");
		m5.put("vicky", "vicky@123");
		m5.put("nakshu", "nakshu@122");
				System.out.println(m5);
				System.out.println(m5.containsKey("Manish"));
				
		Map<String, Integer> m6 = new HashMap<String, Integer>();
				
		m6.put("Ashu", 23);
		m6.put("vicky", 65);
		m6.put("nakshu", 32);
				System.out.println(m6);
				System.out.println(m6.containsValue(23));
				
				//equals
				System.out.println(m6.equals(m5));
				
				
				//remove
				
			m6.remove("Ashu");
			System.out.println(m6);
			
			//replace
			
			m6.replace("vicky", 65,44);
			System.out.println(m6);
			
				//keySet,values,entrySet
			
		Map<String ,Integer> m7 = new IdentityHashMap<String ,Integer>();
			
			m7.put("Ram", 51);
			m7.put("Sita", 45);
			m7.put("Lakshman", 50);
			System.out.println(m7);
			System.out.println(m7.keySet());
			
			System.out.println(m7.values());
			
			System.out.println(m7.entrySet());
			
				
			

	}

}
