package Java_Assignments;


class Calculator {
    // Method to add two integers
    void add(int a, int b) {
      
    	int c= a+b;
    	System.out.println(c);
    }

    // Method to add three integers
    void add(int a, int b, int c) {
    	int d= a+b+c;
    	System.out.println(d);
    }

    // Method to add two doubles
    void add(double a, double b) {
        double c = a + b;
    }
}
public class Compile_Time_polymorphism_Assignment121 

{

	public static void main(String[] args) 
	
	{
		 Calculator c1 = new Calculator();
		 c1.add(11, 23, 13);
		 c1.add(254, 655);
		 c1.add(2.5, 3.5);

	    }

	

}
