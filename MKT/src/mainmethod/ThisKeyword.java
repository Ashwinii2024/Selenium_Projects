package mainmethod;

public class ThisKeyword 

{

	int age;
	String name;
	double salary;
void Student_details(int age, String name, double salary)

{
	this.age = age;
	this.name = name;
	this.salary = salary;
	
}
	
	public static void main(String[] args) 
	
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.Student_details(23,"Ram", 87652);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		
		

	}

}
