package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_Type_India_Click_Search_btn_131
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		//name="q"
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
	//	driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		

	}

}
