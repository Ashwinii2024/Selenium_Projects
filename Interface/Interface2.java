package Interface;



interface ParentInterface1

{
	void xyz();
	void lmn();
}

interface ParentInterface2 extends ParentInterface1
{
	void klm();
	void uvw();
}

public class Interface2 implements ParentInterface2


{ 
	
	
	public static void main(String[] args)
	
	{
		
		Interface2 v2 = new Interface2();
		v2.xyz();
		v2.lmn();
		v2.klm();
		v2.uvw();
		
	}

	@Override
	public void xyz() {
		
		System.out.println("a");
		
	}

	@Override
	public void lmn() {
		
		
		System.out.println("b");
	}

	@Override
	public void klm() {
	
		System.out.println("c");
		
	}

	@Override
	public void uvw() {
		
		System.out.println("d");
		
	}

}
