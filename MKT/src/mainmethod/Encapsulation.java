package mainmethod;

class Parent
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
public class Encapsulation

{

	public static void main(String[] args)
	
	{
		Parent p1 = new Parent();
		p1.setage(45);
		System.out.println(p1.getage());
		

	}

}
