package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_the_googlepage_and_click_on_the_gmail_icon_137 {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
//	WebElement gmail =	driver.findElement(By.linkText("Gmail"));
		WebElement gmail =	driver.findElement(By.partialLinkText("Gma"));
		
	gmail.click();

	}

}
