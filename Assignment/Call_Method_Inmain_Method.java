package Assignment;

public class Call_Method_Inmain_Method 

{
	
static void AreaOfCircle() 
{
	double pi = 3.14;
	int r = 20;
	double AreaOfCircle = pi * r * r;
	System.out.println(AreaOfCircle);
}
	//2pir

void CircumferenceofCircle() {
	double pi = 3.14;
	int r = 20;
	double CircumferenceofCircle = 2 * pi * r;
	System.out.println(CircumferenceofCircle);
}
	
	
	public static void main(String[] args) 
	
	
	{
		AreaOfCircle();
		Call_Method_Inmain_Method C1 = new Call_Method_Inmain_Method();
		C1.CircumferenceofCircle();
		
	}

}
