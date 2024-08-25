package Practice;

public class this_Keyword

{
	int age;
	String name;
	char ch;
	
	void add(int age, String name, char ch)
	
	{
		
		this.age=age;
		this.name=name;
		this.ch =ch;
	}

	public static void main(String[] args) 
	
	{
		this_Keyword t1 = new this_Keyword();
		t1.add(23,"Ram",'c');
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.ch);
		
		
	}

}
