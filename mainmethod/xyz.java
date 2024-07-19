package mainmethod;

public class xyz {
	
	void name() {
		System.out.println("gugi");
	}
	
	void app() {
		System.out.println("app");
	}
	
	
static void add() {
	System.out.println("add");
}
	static void mul(int a, int b) {
		
		System.out.println("gyugyu");
	}
	
	public static void main(String[] args) {
		xyz s1= new xyz();
		s1.name();
		s1.app() ;
		add();
		
		mul(2,4);
	}
}
