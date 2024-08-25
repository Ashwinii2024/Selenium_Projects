package mainmethod;

public class Palindrome 

{

	public static void main(String[] args) 
	
	{
		String s1 = "MoM";
		String s2 = "";
		
		for( int i = s1.length()-1; i>=0; i--)
		
		{
			char c1 = s1.charAt(i);
			s2 = s2 + c1;
		}
		
           System.out.println(s2);
           
           if(s1.equals(s2))
           
           {
        	   System.out.println("The given string is palindrome");
           }
           
           else {
        	   System.out.println("The string is not palindrome");
           }
	}

}
