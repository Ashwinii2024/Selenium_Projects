package mainmethod;

public class Global_variable1

{
      int age =90;
      String name ="Ashwini";
      double  Salary =45.323;
      
      static void add() {
    	Global_variable1 g1 = new Global_variable1();
    	System.out.println(g1.age);
    	System.out.println(g1.name);
    	System.out.println(g1.Salary);
    	
      }
      void sum()
      {
    	  
    	  System.out.println(age);
    	  System.out.println(name);
    	  System.out.println(Salary);
      }
	public static void main(String[] args)
	
	{
		add();
		
		Global_variable1 g2 = new Global_variable1();
		g2.sum();
		


	}

}
