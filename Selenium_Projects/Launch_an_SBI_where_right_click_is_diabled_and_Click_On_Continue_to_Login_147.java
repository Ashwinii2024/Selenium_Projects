package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_an_SBI_where_right_click_is_diabled_and_Click_On_Continue_to_Login_147 {

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(2000);
	    WebElement userName =	driver.findElement(By.name("userName"));
	    userName.sendKeys("Ashwini Pawar");
	    Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("@ashwini");

	}

}
