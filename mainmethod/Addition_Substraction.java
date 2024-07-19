package mainmethod;

public class Addition_Substraction {

	
	static void add()
	{
		int no1= 2;
		int no2 = 5;
		int add = no1 + no2;
		System.out.println(add);
		
	}
	
	static void sub()
	{
		int no1 = 3;
		int no2 = 2;
		int sub =  no1- no2;
		System.out.println(sub);
		
	}
	
	static void mul()
	{
	int no1 = 2;
	int no2 =  3;
	int mul = no1 * no2;
	System.out.println(mul);
	}
	
	static void divide()
	{
		int no1= 40;
		int no2 = 20;
		int mod = no1/no2;
		System.out.println(mod);
	}
	
	
	static void modulus() {
		int no1 = 40;
		int no2 = 20;
		int mod = no1%no2;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
		mul();
		divide();
		modulus();
	}

}
