package mainmethod;


class Google_auth            //parent class

{
	private String passward ="xyz@uh";

	public String getPassword() 
	
	{
		return passward;
		
	}
	
	public void setPassword(String passward)
	
	{
		
		this.passward=passward;
	}
	
	
}
public class Encapsulation1 

{
  
	public static void main(String[] args) 
	
	{
		Google_auth g1 = new Google_auth();
		g1.setPassword("ghjnuh@vh");
		System.out.println(g1.getPassword());
	}

}
