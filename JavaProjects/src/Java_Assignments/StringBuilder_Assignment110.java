package Java_Assignments;

public class StringBuilder_Assignment110 {

	public static void main(String[] args)
	
	{
		//1.Using the default constructor (initial capacity of 16)
		StringBuilder s1 = new StringBuilder();
		
		s1.append("Ashwini");
		System.out.println(s1);
		
		//// 2. Using the constructor with an initial capacity
        StringBuilder s2 = new StringBuilder(50);
        s2.append("Initial capacity set to 50");
        System.out.println("s2: " + s2);  

        // 3. Using the constructor with a String argument
        StringBuilder s3 = new StringBuilder("Hello");
        s3.append(" world!");
        System.out.println("s3: " + s3); 

      System.out.println(s1.length());


	}

}
