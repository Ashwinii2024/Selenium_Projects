package Java_Assignments;


class Parents22
{
	private int age=18;
    
	public int getage()
	
	{
		return age;
	}
	
	public void setage(int age)
	
	{
		this.age =age;
		
	}
}
public class Encapsulation_Assignment123
{

	public static void main(String[] args)
	{
		Parents22 p1 = new Parents22();
		p1.setage(45);
		System.out.println(p1.getage());
		

	}

}
