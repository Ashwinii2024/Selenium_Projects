package mainmethod;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_Program {

	public static void main(String[] args) 
	
	{
		HashSet s1 = new HashSet();
		s1.add("ashwini");
		s1.add(29);
		s1.add("30-04-1995");
		s1.add(null);
		s1.add(null);
		s1.add(true);
		s1.add("ashwini");
		s1.add("Ashwini Pawar");
	/*	s1.add("ashwini");
		s1.add("nakshatra");
		s1.add("hemangi");
		s1.add("krutarth");
		//Collections.sort(s1);*/
		
		System.out.println(s1);

	}

}
