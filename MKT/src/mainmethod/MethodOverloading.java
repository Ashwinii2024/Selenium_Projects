package mainmethod;

public class MethodOverloading
{
  void sum(int a, int b) {
	  int sum = a -b;
	  System.out.println(sum);
  }
  
	static void add(int a) {
		System.out.println("abs");
	}
	
	static void add(int a, int b) {
		a = 3;
		b = 2;
		int add = a +b;
		System.out.println(add);
	}
	 static void add(int a, int b, int c) {
		 int add = a +b+c;
		 System.out.println(add);
	 }
	 static void sub(int a) {
		 System.out.println("hui");
	 }
	 static void sub(int a, char c) {
		 System.out.println("hui");
	 }
	 static void mul(char a) {
		// char a = 'h';
		 System.out.println("uii");
	 }
		 
		 static void add(double c, int b) {
			 double add = c + b;
			 System.out.println(add);
		 }
		 
		 static void add(int a, double b, String name) {
			 System.out.println("nn");
		 }
		
	
public static void main(String[] args)

{
	MethodOverloading M1 = new MethodOverloading();
	M1.sum(4,2);
	
	add(4);
	add(2,4);
	add(1,1,1);
	sub(1);
	mul('a');
	add(2.43, 3);
	add(11,7.8,"Man");
	
	
}


}
