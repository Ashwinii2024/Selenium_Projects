package ArrayList;

import java.util.HashSet;

public class HashSet_Class

{

	public static void main(String[] args) 
	
	{
      HashSet s1 = new HashSet();

      s1.add("nakshu");
		s1.add("ashu");
		s1.add("Ashu");
		s1.add(null);
		s1.add(null);
		s1.add(3.14);
        System.out.println(s1);
        HashSet s2 = new HashSet();
        s2.addAll(s1);
        System.out.println(s2);
        s2.add("ram");
        System.out.println(s2);
		System.out.println(s1.contains("Ashu"));
		System.out.println(s1.equals(23));
		System.out.println(s2.isEmpty());
		s2.remove("ram");
		System.out.println(s2.size());
		
		
	}

}
