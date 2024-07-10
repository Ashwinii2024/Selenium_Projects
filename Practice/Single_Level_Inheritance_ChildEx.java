package Practice;

import java.util.Scanner;


class Single_Level_Inheritance_Parent           //parent class

{
	 void ParentsInformation() 
	
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Print Fathers age");
		int Fathersage = s1.nextInt();
		System.out.println("Print Mothers age");
		int Mothersage = s1.nextInt();
		
		if(Fathersage > Mothersage)
			
		{
			System.out.println("Condition is true");
		}
		
		else {
			System.out.println("Condition is false");
		}
		
		
	}
	 
	
}

public class Single_Level_Inheritance_ChildEx  extends Single_Level_Inheritance_Parent         //child class

{
	//private  int Fathersage = 0;

	static void MyInformation() 
	
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Add your name");
		
		String name = s1.next();
		
		System.out.println("Add your age");
		int age = s1.nextInt();
		
     
	
	}
	
	public static void main(String[] args) 
	
	{
		Single_Level_Inheritance_ChildEx S1 = new Single_Level_Inheritance_ChildEx();
		
		
		MyInformation();
		S1.ParentsInformation();
	}
}
