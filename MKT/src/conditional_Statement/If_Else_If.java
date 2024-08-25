package conditional_Statement;

public class If_Else_If {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 40;
		
		if(a == 30) {
			System.out.println("a is not equal to b");
		}
      
		else if(a > b ) {
			System.out.println(" a is less than b");
		}
		
		else if(b < c) {
			System.out.println("b is less than c");
		}
		
		else {
			System.out.println("2 else if is correct");
		}
	}

}
