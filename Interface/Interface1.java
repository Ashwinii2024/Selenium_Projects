package Interface;

interface Google_Auth
{
	void add();
	void sum();
	
	
}

public class Interface1 implements Google_Auth


{
	
	
	public static void main(String[] args) {
		
		Interface1 c1 = new Interface1();
		
		c1.add();
		c1.sum();
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sum() {
		System.out.println("sum");
	}

}
