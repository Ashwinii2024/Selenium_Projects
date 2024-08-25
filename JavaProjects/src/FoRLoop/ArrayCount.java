package FoRLoop;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {12,23,34};
		int Sum = 0;
		int i;
		
		for(i = 0; i<myArray.length; i++) {
			Sum += myArray[i];
			
		}
		System.out.println(Sum);
	}

}
