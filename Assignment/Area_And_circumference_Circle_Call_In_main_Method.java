package Assignment;

public class Area_And_circumference_Circle_Call_In_main_Method


{
	
static void AreaofCircle()
{
	int r = 4;
	
	double AreaofCircle = Math.PI * r *r;
	System.out.println(AreaofCircle);
}

static void CircumferanceOfCircle()

{
	int radius = 56;
	
	double  CircumferanceOfCircle = 2 *Math.PI* radius;
	System.out.println(CircumferanceOfCircle);
	
}


	public static void main(String[] args)
	{
		AreaofCircle();
		 CircumferanceOfCircle();
	}

}
