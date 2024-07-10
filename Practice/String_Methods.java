package Practice;

public class String_Methods {

	public static void main(String[] args)
	
	{
		String name ="My Name is Ashwini";
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.indexOf('A'));
		System.out.println(name.charAt(1));
	
		String name1 ="  My Name is Ashwini  ";
		
		System.out.println(name1.trim());
		
		System.out.println(name.equals(name1));
		
		String s="xyz";
		String s1="XYZ";
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(name.contains("Ashwini"));
		
		
		

	}

}
