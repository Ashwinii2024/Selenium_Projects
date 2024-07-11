package Abstract_Concrete_Concept;


interface GrandParents

{
	
	void Grandpa();
	void Granny();
	
}

interface Parents

{
	void mummy();
	void daddy();
	
}
public class Multiplelevel_Interface implements Parents, GrandParents

{
	
    public static void main(String[] args) 
    
    {
    	
    	Multiplelevel_Interface m1 = new Multiplelevel_Interface();
    	m1.Grandpa();
    	m1.Granny();
    	m1.mummy();
    	m1.daddy();
    }

	@Override
	public void Grandpa() {
		int a = 3;
		int b= 4;
		int c = a + b;
		System.out.println(c);
	}

	@Override
	public void Granny() 
	{
		System.out.println("Granny");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mummy() {
		System.out.println("mummy");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void daddy() {
		System.out.println("daddy");
		// TODO Auto-generated method stub
		
	}
}
