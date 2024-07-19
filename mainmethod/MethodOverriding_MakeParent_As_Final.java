package mainmethod;


class Select_Gender

{
	 void Gender() {
		
		
		System.out.println("Select Female");
	}
	
}
public class MethodOverriding_MakeParent_As_Final extends Select_Gender


{
   void Gender() {
		
	   super.Gender();
		System.out.println("Select Male");
		
	}
   
   public static void main(String[] args) 
   
   {
	   MethodOverriding_MakeParent_As_Final M1 = new MethodOverriding_MakeParent_As_Final();
	   M1.Gender();
	   
   }
}
