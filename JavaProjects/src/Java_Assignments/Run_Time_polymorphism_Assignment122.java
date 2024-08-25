package Java_Assignments;


class Random_Class

{
	void login() {
		System.out.println("Emain Id");
	}
}
public class Run_Time_polymorphism_Assignment122 extends Random_Class

{
	void login() {
		System.out.println("Mobile Number");
	}

	public static void main(String[] args) 
	
	{
		Random_Class r1 = new Random_Class();
		r1.login();
	}

}
