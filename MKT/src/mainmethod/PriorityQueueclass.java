package mainmethod;

import java.util.PriorityQueue;

public class PriorityQueueclass {

	public static void main(String[] args) 
	
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add("Ashwini");
		p1.add("zyx");
		p1.add("Nakshu");
		System.out.println(p1);
		PriorityQueue p2 = new PriorityQueue();
		p2.addAll(p1);
		p2.add("abc");
		//p1.contains("abc");
		System.out.println(p1.contains("abc"));
		p1.clear();
		System.out.println(p1.equals(p2));
		System.out.println(p1);
		System.out.println(p2);
		
		

	}

}
