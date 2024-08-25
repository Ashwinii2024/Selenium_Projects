package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_Using_Wrapper_Class {

	public static void main(String[] args) 
	
	
	{
		Map<String, String> m1 = new HashMap<String, String>();
		
		m1.put("Ashu", "patlashu@122");
		m1.put("vicky", "vicky@123");
		m1.put("nakshu", "nakshu@122");
		System.out.println(m1);
		

		Map<String, Integer> m2 = new HashMap<String, Integer>();
		
		m2.put("Ashu", 23);
		m2.put("kanhu", 45);
		System.out.println(m2);
		
		m2.putIfAbsent("Krishna", 32);
		
		System.out.println(m2);
		
		m1.replace("Ashu", "patlashu@122","ashu767@gh");
		System.out.println(m1);
		
	}
}
