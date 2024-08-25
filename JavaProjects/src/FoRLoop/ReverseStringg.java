package FoRLoop;

public class ReverseStringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String OriginalStr = "Hello";
		
		String ReversedStr = "";
		
		System.out.println("Original String: " + OriginalStr);
		
		
		for (int i = 0; i < OriginalStr.length(); i++) 
		{
			
			ReversedStr = OriginalStr.charAt(i) + ReversedStr;
			
		}
		
		System.out.println("Reverse String: " + ReversedStr);
	}

}
