package Java_Assignments;

public class StringBuffer_Assignment108

{

	public static void main(String[] args) 
	
	{
		
		//1.Using the default constructor (initial capacity of 16)
		StringBuffer s1 = new StringBuffer();
				
				s1.append("Ashwini");
				System.out.println(s1);
				
				//// 2. Using the constructor with an initial capacity
				StringBuffer s2 = new StringBuffer(50);
		        s2.append("Initial capacity set to 50");
		        System.out.println("s2: " + s2);  

		        // 3. Using the constructor with a String argument
		        StringBuffer s3 = new StringBuffer("Hello");
		        s3.append(" world!");
		        System.out.println("s3: " + s3); 

		      System.out.println(s1.length());

	}

}
