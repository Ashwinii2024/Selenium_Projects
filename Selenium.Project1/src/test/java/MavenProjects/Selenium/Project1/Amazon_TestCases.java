package MavenProjects.Selenium.Project1;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_TestCases  extends AmazonLaunch_Quit

{
	@Test
	public void Registration_Form() throws InterruptedException
	{ 
		
		RegistrationPage a1= new RegistrationPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(500));
	    
		a1.SignInBtn(driver);
	    
	    a1.ClickOnSignBtn();
	 
	    a1.Create_New_Account();
	    
	   // wait.until(ExpectedConditions.visibilityOf(a1.customerName));
	   
	    //Customername
	    a1.Customer_name();
	   
	    Assert.assertEquals(a1.customerName.isDisplayed(), true, "Customer name input field is not displayed!");
	    
	    //phoneno
	    a1.Phone_No();
	    
	    //password
	    a1.Password();
	    
	    //contiunueBtn
	    a1.Continue_Btn();
	    
	    //verifyBtn
	// wait.until(ExpectedConditions.visibilityOf(a1.VerifyBtn));
	   // a1.Verify_Btn();
	    
	   
	}
	
}
