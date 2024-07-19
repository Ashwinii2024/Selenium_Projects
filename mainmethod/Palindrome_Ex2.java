package mainmethod;

public class Palindrome_Ex2 {

	public static void main(String[] args)
	//Madam
	
	{
		String s1 = "Madam";
		String s2 ="";
		for(int i = s1.length()-1; i>=0; i--) 
		
		{
			char c = s1.charAt(i);
			s2 = s2+c;
		}
		
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			
			System.out.println("They are palidrom");
		}
		
		else {
			System.out.println("They are not palindrom");
		}


	}
	
}
