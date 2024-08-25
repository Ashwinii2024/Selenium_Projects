package mainmethod;

public class Final_Variable

{
      final static double pi =3.14;
      
      static void area() {
    	  int r = 2;
    	  
    	  double area = (pi * r * r);
    	  System.out.println(area);
    	   
      }
      
      static void circumferance() {
    	  int r =4;
    	  double circumferance = (2 * pi * r);
    	  System.out.println(circumferance);
      }
      
      
	public static void main(String[] args) 
	{
		
		
		area();
		circumferance();

	}

}
