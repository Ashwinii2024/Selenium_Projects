package Assignment;

public class Multiple_Static_Method_Assignment

{
	static void add() {
	
	int a = 12;
	int b = 2;
	int add = a + b;
	
	System.out.println(add);
	
	}
	
	static void sub() {
		int a = 12;
		int b= 10;
		int sub = a - b ;
		System.out.println(sub);
	}
	
	static void mul() {
		int a = 12;
		int b= 10;
		int mul = a * b ;
		System.out.println(mul);
	}
	
    static void name () {
    	
    	String name = "Ashwini";
    	System.out.println(name);
    }

	public static void main(String[] args) {
		add();
		sub();
		mul() ;
		name () ;

	}

}
