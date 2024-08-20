package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_New_Account_On_Fb {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement account = driver.findElement(By.linkText("Sign up for Facebook"));
		Thread.sleep(2000);
		account.click();
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Ashwini@gmail.com");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("@shaini");
		
		WebElement reg_email__ = driver.findElement(By.name("reg_email__"));
		reg_email__.sendKeys("8104845408");
		
		WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		reg_passwd__.sendKeys("@ghj");
		
		WebElement radioBtn = driver.findElement(By.linkText("Female"));
		radioBtn.click();
		
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
		
		

	}

}
