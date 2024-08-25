package Java_Assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentTimeandget_Assignment127 

{

	public static void main(String[] args) 
	
	{

		
		/*Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println("Current Time --->" + d2);*/
		
		 LocalDateTime currentDateTime = LocalDateTime.now();

	        // Format the date as dd/MM/yyyy
	 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  String formattedDate = currentDateTime.format(dateFormatter);

	        // Print the current date
	  System.out.println("Current Date: " + formattedDate);


	}

}
