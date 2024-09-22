package MavenProjects.Selenium.Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage

{
	 static WebDriver driver;
   @FindBy(id="nav-link-accountList")
   WebElement Signinbtn;
   
   @FindBy(id="nav-flyout-ya-signin")
   WebElement ClickSignIn;
   
   @FindBy(id="createAccountSubmit")
   WebElement CreateAccount;
   
   @FindBy(name="customerName")
   WebElement customerName;
   
   @FindBy(id="ap_phone_number")
   WebElement Phonenumber;
   
   @FindBy(id="ap_password")
   WebElement password;
   
   @FindBy(id="continue")
   WebElement continueBtn;
   
   @FindBy(id="auth-verify-button")
   WebElement VerifyBtn;
   
   public void SignInBtn(WebDriver driver)
   {
	   Actions a1 = new Actions(driver);
	   a1.moveToElement(Signinbtn).perform();
   }
   
   public void ClickOnSignBtn()
   {
	   
	   ClickSignIn.click();
	  
	    
   }
   
   public void Create_New_Account()
   {
	  /* Set<String> s1 =  driver.getWindowHandles();
		  Iterator<String> i1 = s1.iterator();
		  String parentId = i1.next();
		  String childId = i1.next();
		  System.out.println(parentId);
		  System.out.println(childId);
		  driver.switchTo().window(childId);*/
	      CreateAccount.click();
	   
   }
   
   public void Customer_name()
   {
	customerName.sendKeys("Ashwini");
   }
   public void Phone_No()
   {
	   FileInputStream f1 = null;
	    Workbook w1 = null;
	    try {
	      f1 = new FileInputStream("C:\\Users\\harsh\\eclipse-workspace\\Selenium_Basics\\DDT\\login.xlsx");
	    	//  f1 = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Documents\\DDT\\abc.txt");
	    	w1 = WorkbookFactory.create(f1);
	    	long PhoneNumber = (long) w1.getSheet("abc").getRow(1).getCell(0).getNumericCellValue();
	       // String password = w1.getSheet("abc").getRow(1).getCell(1).getStringCellValue();
	       
	    	  // Convert the numeric value to a string
	        String phoneNumber = String.valueOf(PhoneNumber);
	    	System.out.println("Phonenumber: " + Phonenumber);
	    	Phonenumber.sendKeys(phoneNumber);
	       // System.out.println("Password: " + password);
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("IO Exception: " + e.getMessage());
	    } finally {
	        try {
	            if (f1 != null) {
	                f1.close();
	            }
	            if (w1 != null) {
	                w1.close();
	            }
	        } catch (IOException e) 
	        {
	            System.out.println("Error closing resources: " + e.getMessage());
	        }
	    }
	    
   }
   
   public void Password()
   {
	   FileInputStream f1 = null;
	    Workbook w1 = null;
	    try {
	      f1 = new FileInputStream("C:\\Users\\harsh\\eclipse-workspace\\Selenium_Basics\\DDT\\login.xlsx");
	    	//  f1 = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Documents\\DDT\\abc.txt");
	    	w1 = WorkbookFactory.create(f1);
	    	//long PhoneNumber = (long) w1.getSheet("abc").getRow(1).getCell(0).getNumericCellValue();
	        String Password = w1.getSheet("abc").getRow(1).getCell(1).getStringCellValue();
	        password.sendKeys(Password);
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("IO Exception: " + e.getMessage());
	    } finally {
	        try {
	            if (f1 != null) {
	                f1.close();
	            }
	            if (w1 != null) {
	                w1.close();
	            }
	        } catch (IOException e) 
	        {
	            System.out.println("Error closing resources: " + e.getMessage());
	        }
	    }
	    
   }
   
   public void Continue_Btn()
   {
	   continueBtn.click();
   }
   public void Verify_Btn()
   {
	   VerifyBtn.click();
   }
   public RegistrationPage(WebDriver driver)
   
   {
	   PageFactory.initElements(driver, this);
   }
   
   
}
