package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon_Click_On_Customer_Service_Using__LinkText_Partial_LinkText {

	public static void main(String[] args) throws InterruptedException 
	
	{

       ChromeDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.get("https://www.amazon.in");
       
       // WebElement majortab  = driver.findElement(By.linkText("Customer Service"));
       WebElement majortab  = driver.findElement(By.partialLinkText("Customer"));
        
       majortab.click();
       //https://retail.onlinesbi.sbi/retail/login.htm
	}

}
