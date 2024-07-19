package mainmethod;

public class MathClass_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(Math.addExact(2,3));                         //int, int
      System.out.println(Math.addExact(1222222222, 233333333));        // long, long
      System.out.println(Math.subtractExact(12,40));                   //int, int
     System.out.println(Math.subtractExact(1234444, 111111));                // long, long
     System.out.println(Math.multiplyExact(12, 46));                   //int , int
     System.out.println(Math.multiplyExact(1234444, 45));                               // long , int
    // System.out.println(Math.multiplyExact(433223, 44333));    
     double pi = Math.PI;
     System.out.println(pi);
    System.out.println(Math.PI); 
    System.out.println(Math.min(3.56, 5.43));
    System.out.println(Math.min(876.554, 98.654444));
   System.out.println(Math.min(32, 1)); 
   System.out.println(Math.max(432566, 98543333));
   System.out.println(Math.sqrt(pi));
  System.out.println(Math.sqrt(9)); 
  
	}

}
