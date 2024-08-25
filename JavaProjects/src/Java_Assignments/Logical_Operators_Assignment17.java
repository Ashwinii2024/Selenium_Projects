package Java_Assignments;

public class Logical_Operators_Assignment17 {

	public static void main(String[] args) {
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


