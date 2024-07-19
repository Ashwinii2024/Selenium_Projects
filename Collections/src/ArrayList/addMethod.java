package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class addMethod {

	public static void main(String[] args)
	
	{
		ArrayList a1 = new ArrayList();
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("lakshman");
		a1.add("Bharat");
		/*a1.add(29);
		a1.add(true);
		a1.add(null);
		a1.add(2,4);*/
		
		Collections.sort(a1);
		
		
		
		System.out.println(a1);

	}

}
