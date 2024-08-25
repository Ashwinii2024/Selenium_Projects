package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) 
	
	{
       ArrayList a1 = new ArrayList();
		
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Lakshman");
		
		//Collections.sort(a1);
		System.out.println("a1 is----" + a1);
		
		a1.add(0,"Ashwini");       //add(indexing object)
		System.out.println("added Ashwinin in idexing position 0 ------" +a1);
		
		//addAll Method
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add("Sita");
		a2.add("Puja");
		a2.add(23);
		
		System.out.println("a2 is----" +a2);
		
		//remove
		a2.remove("Lakshman");
		System.out.println(a2);
		
		//remove with indexing position
		a2.remove(0);
		System.out.println(a2);
		
		
		//contains
		
		System.out.println(a2.contains("Sita"));
		
		a2.removeAll(a1);
		System.out.println(a2);
		
//size
		
		System.out.println(a2.size());
		//System.out.println(a2);
		
		//isEmpty
		
		//System.out.println(a2.isEmpty());
		//Iterator
		ListIterator l1 = a2.listIterator();
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		
	}

}
