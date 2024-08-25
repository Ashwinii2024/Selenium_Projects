package mainmethod;

import java.util.Arrays;

public class CountAlpha {

	public static void main(String[] args) {

   String name ="Ashwini815";

   int count_alpha =0;
   int count_digit =0;
   
   char c1[] = name.toCharArray();
   System.out.println(Arrays.toString(c1));
   
   for(int i=0;i<name.length();i++) {
	   
	   boolean b1 = Character.isAlphabetic(c1[i]);
	   boolean b2 = Character.isDigit(c1[i]);
	   
	   if(b1==true) {
		   count_alpha++;
	   }
	   if(b2==true)
	   {
		   count_digit++;
	   }
   }
   System.out.println("Count of Aplha :" +count_alpha);
   System.out.println("Count digit :" +count_digit);

	}

}
