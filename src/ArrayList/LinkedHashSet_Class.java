package ArrayList;

import java.util.LinkedHashSet;

public class LinkedHashSet_Class

{

	public static void main(String[] args) 
	
	{
		LinkedHashSet l1 = new LinkedHashSet();
		    l1.add("nakshu");
		    l1.add("ashu");
		    l1.add("Ashu");
		    l1.add(null);
		    l1.add(null);
		    l1.add(3.14);
	        System.out.println(l1);
	        LinkedHashSet l2 = new LinkedHashSet();
	        l2.addAll(l1);
	        System.out.println(l2);
	        l2.add("ram");
	        System.out.println(l2);
			System.out.println(l1.contains("Ashu"));
			System.out.println(l1.equals(23));
			System.out.println(l1.isEmpty());
			l2.remove("ram");
			System.out.println(l2.size());
			
		

	}

}
