package Java_Assignments;

import java.util.IdentityHashMap;
import java.util.Map;

public class Map_Interface_KeySet_Iteration_Assignment113 {

	public static void main(String[] args) 
	
	{
		Map<String ,Integer> m1 = new IdentityHashMap<String ,Integer>();
		
		m1.put("Ram", 51);
		m1.put("Sita", 45);
		m1.put("Lakshman", 50);
		System.out.println(m1);
		
	    for(String k:m1.keySet()) 
	    
	    {
	    	
		System.out.println(k);
	    }
		
	
	}

	

}
