package Java_Assignments;

import java.util.Date;

public class Past_time_Assignment126 

{

	public static void main(String[] args) 
	{

		Date d1 = new Date();
		System.out.println(d1.getTime());
		

		Date d4 = new Date(d1.getTime()-(1000*60*60*24*1));
		
		System.out.println("Past Time --->"+ d4);
	}

}
