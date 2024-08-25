package ArrayList;

public class String_Buffer_Class {

	public static void main(String[] args) 
	
	{
		
String s2 = new String("Ashwini");
String b = s2.concat("Pawar");
System.out.println(s2);
System.out.println(b);
		
System.out.println("<-----Append Method---->");
StringBuffer s1 = new StringBuffer("Ashwini");
s1.append(" Pawar");
System.out.println(s1);

System.out.println("<---Length---->");

System.out.println(s1.length());

System.out.println("<----Substring------>");
System.out.println(s1.substring(1));

System.out.println(s1.substring(1,7));
System.out.println("<---Reverse---->");
System.out.println(s1.reverse());

StringBuffer s5 = new StringBuffer("Yogesh");
System.out.println("<-----delete------>");
System.out.println(s5.delete(0, 4));

System.out.println("<---indexOf->");
System.out.println(s1.indexOf("Pawar"));

System.out.println("----------charAt-------->");
System.out.println(s1.charAt(6));

System.out.println("<----Replace---->");
StringBuffer s7 = new StringBuffer("Ashwini Pawar");
System.out.println(s7.replace(0, 8, "Nakshatra "));


StringBuffer s3 = new StringBuffer ("Monika Nath");

System.out.println("<-----Delete----->");
System.out.println(s3.delete(0, 6));

System.out.println("<----Capacity----->");
System.out.println(s1.capacity());


	}

}
