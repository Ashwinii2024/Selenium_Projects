package MavenProjects.Selenium.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonLaunch_Quit 

{
	  WebDriver driver;
  @BeforeMethod
  public void Launch_Chrome()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in");
     }
  @AfterMethod
  public void Quit()
  {
	  driver.quit();
  }
}
