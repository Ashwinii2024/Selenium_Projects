package mainmethod;



public class This_CallingStatement_Constructor

{  
	
	This_CallingStatement_Constructor(int age)
	
	{
		System.out.println(age);
	}
	
	This_CallingStatement_Constructor(double weight)
	
	{
		this(30);
		System.out.println(weight);
	}
	
	This_CallingStatement_Constructor(String name){
		this(54.6);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		new This_CallingStatement_Constructor("Ram");
		
	}

}
