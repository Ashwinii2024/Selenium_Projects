package mainmethod;

public class Exception_handling_Try_And_Catch


{
   public static void main(String[] args)
   
   {
	   try 
	   
	   {  
		 System.out.println("abc");  
	   int c= 1/0;
	   System.out.println(c);
	   
	   }
			   
	   catch(ArithmeticException a) 
	   {
		   System.out.println("xyz");
	   }
	   
   }
}
