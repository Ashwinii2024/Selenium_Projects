package mainmethod;

import java.util.Date;
import java.util.Scanner;

public class Date_Time {
	
	public static void main(String[] args) 
	{
		
Date d1 = new Date();
System.out.println(d1.getTime());

Date d2 = new Date(d1.getTime());
System.out.println("Current Date :" +d2);

String human = d2.toString();
//Wed Aug 14 14:27:40 IST 2024
String day = human.substring(7, 10);
System.out.println("day :" +day);
String Month = human.substring(3, 7);
System.out.println("Month :" +Month);
String Year = human.substring(24);
System.out.println("Year :" +Year);

String time = human.substring(10, 19);
System.out.println("Time :" +time);


Date d3 = new Date(d1.getTime()+(1000*60*60*24*1));
System.out.println("Future Time :" +d3);

Date d4 = new Date(d1.getTime()-(1000*60*60*24*1));
System.out.println(d4);






	
		
		
	
	

	}

}
