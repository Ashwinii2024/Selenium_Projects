package Assignment;

public class If_Else {

	public static void main(String[] args) {
		
		
		int age = 17;
		
		
	
		if(age > 18) {
			System.out.println("Person is not eligible");
		}
		
		else if( age < 18) {
			System.out.println("person is eligible for vote");
		}
		
		else {
			System.out.println("Age is greater than 18 is eligible for vote");
		}
	}

}
