package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_FB_Username_Paswrd_using_name_Loctr_80 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("patilashu.com");
		
		driver.findElement(By.name("pass")).sendKeys("April@");
		
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		

	}

}
