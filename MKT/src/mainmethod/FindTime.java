package mainmethod;

import java.util.Date;

public class FindTime {

	public static void main(String[] args) 
	
	{
		Date d1 =new Date();
		System.out.println(d1.getTime());
		
	    Date d2 = new Date(d1.getTime());
	    System.out.println("Current Time-->" +d2);
	    String human = d2.toString();
	    String day =human.substring(8, 10);
	    System.out.println(day);
	    String month =human.substring(4, 7);
	    System.out.println(month);
	    //Wed Aug 07 18:21:44 IST 2024
	    
	   String Year =human.substring(24);
	  
	   System.out.println(Year);
	 
	    
	    
	    Date d3 = new Date(d1.getTime()+(1000*60*60*24*49));
	    System.out.println("Future Time-->" +d3);
	    
	    Date d4 = new Date(d1.getTime()-(1000*60*60*24*1));
	    System.out.println("Past Time--->" +d4);
	  

	}

}
