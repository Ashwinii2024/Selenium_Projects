package mainmethod;

public class Multiple_Constructor 

{
     
	Multiple_Constructor(){
		System.out.println("x");
	}
	
	Multiple_Constructor(int a, int b){
		a = 21;
		b = 2;
		int sum = a + b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	
	{
		Multiple_Constructor M1 = new Multiple_Constructor();
		new Multiple_Constructor(1,2);
		

	}

}
