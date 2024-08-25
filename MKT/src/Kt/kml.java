package Kt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kml

{
    

	public static void main(String[] args) 
	
	{
		
		ArrayList a1= new ArrayList();
		a1.add("xyz");
		a1.add("jayu");
		a1.add("nakshu");
		a1.add("ashu");
		a1.add("kanhu");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println("reverseorder" + a1);
		
		
	}

}
