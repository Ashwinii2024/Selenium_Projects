package Selenium_Projects;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Utilize_methods {

	public static void main(String[] args) throws InterruptedException  
	{
		//ChromeDriver class is used to launch the empty chrome browser
		ChromeDriver Driver = new ChromeDriver();
		
		//manage method is used to maximize and minimize the window.
		Driver.manage().window().minimize();
		Thread.sleep(2000);
		Driver.manage().window().maximize();
		
		
		
	    //get method is used to launch particular URL
		   Driver.get("https://www.facebook.com");
		
	     //getWindowHandle gives the browser id of parent window or tab or the window that has the control
		System.out.println(Driver.getWindowHandle());
		
		//getWindowHandles gives the browser id of the parent id or child id of the window
		System.out.println(Driver.getWindowHandles());
		
		//getTitle this method is give you the Title of the page.
		System.out.println(Driver.getTitle());
		
	
		//close method is used to close the the parent tab or it can close that tab that has the control.
		Thread.sleep(2000);
		Driver.close();
		//d1.quit();

	}

}
