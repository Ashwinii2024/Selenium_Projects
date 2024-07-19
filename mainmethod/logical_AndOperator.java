package mainmethod;

public class logical_AndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		char gender = 'F';
		if(age >= 19 && gender == 'M') {
			System.out.println("Statement1 is correct");
		}
		/*else {
			System.out.println("statement 2 is correct");
		}*/
		
		if( age < 17 || gender == 'F' ) {
			System.out.println("statement 2 is correct");
		}
		
		if( !(age < 17 || gender == 'F' )) {
			System.out.println("statement 2 is correct");
		}
	}
	
	

}
