package Practice;

import java.util.Arrays;

public class Copy_One_Array_Into_Anotherarray_Ex {

	public static void main(String[] args) 
	
	
	{
		String str1[] = new String[2];
		str1[0] = "Ram";
		str1[1] ="Shyam";
		
		String str2[] = new String[2];
		
		for(int i = 0; i <2; i++)
		
		{
			str2[i]=str1[i];
			
		}
				System.out.println(Arrays.toString(str1));
				System.out.println(Arrays.toString(str2));
				
				
				
				char c[] = new char[4];
				c[0] = 'a';
				c[1] ='b';
				c[2] ='c';
				c[3] ='d';
				
				char c1[] = new char[4];
				for(int i =0; i<=3;i++) 
				
				{
					c1[i]=c[i];
					
				}
				System.out.println(Arrays.toString(c));
				System.out.println(Arrays.toString(c1));
				
				
				
	}

}
