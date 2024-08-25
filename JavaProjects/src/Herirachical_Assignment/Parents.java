package Herirachical_Assignment;

import java.util.Scanner;

public class Parents



{
    static void pi () {
    	double pi = Math.PI;
    	System.out.println(pi);
    	
    }
    
    static void sub(int a, int b) {
        a = 5;
    	 b = 3;
    	int c = a -b;
    	System.out.println(c);
    }
    
    void areaofcircle() {
    	double r = Math.random();
    	double pi = Math.PI;
    	
    double 	areaofcircle = pi*r*r;
    System.out.println(areaofcircle);
    
    
    	
    	
    }
    
    static void calculator() {
    	Scanner S1 = new Scanner(System.in);
    	
    	System.out.println("Print a");
    	int a = S1.nextInt();
    	System.out.println("Print b");
    	int b = S1.nextInt();
    	System.out.println("add c");
    	int c = a + b;
    	System.out.println(c);
    	
    	
    }
    
    static void ifelse() {
    	
    	int age = 18;
    	
    	if( age < 17) {
    		
    		System.out.println("Person is not eligible for vote");
    	}
    	
    
    	else {
    		System.out.println("age is eligible for vote");
    	}
    	
    	
    	
    	
    	
    	
    }
}
