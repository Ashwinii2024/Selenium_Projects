package mainmethod;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int age = 19;
          char gender = 'M';
          
          if(!(age >=  18 && gender == 'M'))
          {
        	  System.out.println("statement 1 is incorrect");
          }
          else if (!(age >=  20 || gender == 'F'))  {
        	  System.out.println("statement 2 is incorrect");
          }
          else {
        	  System.out.println("above both conditions are false");
          }
          }
	

}
