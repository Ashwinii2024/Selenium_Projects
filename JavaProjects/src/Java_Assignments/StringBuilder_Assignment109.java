package Java_Assignments;

public class StringBuilder_Assignment109 

{

	public static void main(String[] args)
	
	{

		StringBuilder s1 = new StringBuilder("Ashwini");
		s1.append(" Pawar");
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(1));
		
		System.out.println(s1.subSequence(1, 7));
		
		System.out.println(s1.reverse());
		
		System.out.println(s1.delete(0, 4));
		
		System.out.println(s1.indexOf("Pawa"));
		
		System.out.println(s1.charAt(4));
		s1.replace(0, 8, "Nakshu");
		System.out.println(s1);
		
     	System.out.println(s1.capacity());
		
	}

}
