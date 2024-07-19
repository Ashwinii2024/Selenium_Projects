package mainmethod;

import java.util.Arrays;

public class Array_Function {
	
	//DataType Variavle[] = new [Siz_Of_Array]
	

	public static void main(String[] args) 
	
	{
		//string array
		String name[] = new String[3];
		name[0]  = "abc";
		name[1] = "xyz";
		name[2] = "uvw";
		//name[3] = "pol";
		
		/*for(int i =0; i<=2; i++) 
		{
			System.out.println(name[i]);
		}*/
		
		System.out.println(Arrays.toString(name));
		
		//int array
		int k[] = new int[5];
		
		k[0] = 1;
		k[1] = 2;
		k[2] = 3;
		k[4] = 4;
		
		/*for(int i =0; i<4; i++) {
			System.out.println(k[i]); */
			
			System.out.println(Arrays.toString(k));
			
		//char array
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		
		System.out.println(Arrays.toString(ch));
		
		//boolean array
		
		Boolean bn[] = new Boolean[2];
		bn[0] = true;
		bn[1] = false;
		
		/*for(int i = 0 ; i <2; i++) {
			
			System.out.println(bn[i]); 
			
			
		}*/
		
		//check if the two array are equals or not
		
		String Schoolname[] = new String[3];
		Schoolname[0] = "Ram";
		Schoolname[1] =" Shyam";
		Schoolname[2]  = "Jam";
		
		String Schoolname1[] = new String[3];
		Schoolname[0] = "Ram";
		Schoolname[1] =" Shyam";
		Schoolname[2]  = "Jam";
		
		System.out.println(Arrays.equals(Schoolname, Schoolname1));
		
		
		
		
		
		
		
	}
}


