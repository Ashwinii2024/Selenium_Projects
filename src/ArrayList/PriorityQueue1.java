package ArrayList;

import java.util.PriorityQueue;

public class PriorityQueue1 

{

	public static void main(String[] args) 
	
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add("nakshu");
		p1.add("Ashu");
		p1.add("Ashu");
		PriorityQueue p2 = new PriorityQueue();
		p2.addAll(p1);
		p2.add("ram");
		p2.add("shyam");
		p1.size();
		p1.contains("nakshu");
		
	System.out.println(p1);
	System.out.println(p2);

	}

}
