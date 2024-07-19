package mainmethod;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_sort {

	public static void main(String[] args)
	
	{
		LinkedList l1 = new LinkedList();
		
		
		l1.add('s');
		l1.add('l');
		l1.add('n');
		l1.add('x');
		
		l1.add('a');
		Collections.sort(l1);
		System.out.println(l1);

	}

}
