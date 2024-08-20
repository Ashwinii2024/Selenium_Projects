package Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsouteXpath_Assignment138 {

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/harsh/Downloads/learningHTML1%20(1).html");
		
        WebElement UserName = driver.findElement(By.xpath("(/html/body/input)[1]"));
        
        UserName.sendKeys("Ashwini");
        Thread.sleep(2000);
       WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
        
       hint.sendKeys("Pawar");
       Thread.sleep(2000);
       WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
       
       password.sendKeys("@ashu");
       
       Thread.sleep(2000);
      WebElement FirstName =  driver.findElement(By.name("fname"));
      FirstName.sendKeys("ashu");
      
      Thread.sleep(2000);
      
      //WebElement submitBtn = driver.findElement(By.xpath("(/html/body/input)[4]"));
      
      //submitBtn.click();
      
      //(/html/body/form/input)[5]
      
      WebElement checkBox =   driver.findElement(By.xpath("(/html/body/form/input)[5]"));
      checkBox.click();
      //(/html/body/input)[6]
      Thread.sleep(2000);

      WebElement checkBox1 =   driver.findElement(By.xpath("(/html/body/input)[6]"));
      checkBox1.click();
      
     
      Thread.sleep(2000);

      WebElement click1 =   driver.findElement(By.linkText("Click to know about us"));
      click1.click();
      
      
      
       
       
       
 
 
        
        
	}

}
