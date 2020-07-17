package repeatJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	WebDriver driver ;
		//pre condition annotation
		@BeforeTest
		public void OpenBrowser(){
			//System.out.println("Browser Openned");
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
		}
		//Steps Annotations
		//if we want to enabled the test
		@Test( enabled=false, priority=0, description="This is a mandatory step", testName="Smoke")
		public void FirstRegistration(){
			driver.findElement(By.xpath("")).sendKeys("John");
			System.out.println("User should first register an account");
		}
		
		@Test(priority=1)
		public void Login(){
			System.out.println("Login Success");
		}
		
		@Test(priority=2)
		public void PrepareEmail(){
			System.out.println("Create Mail");
		}
		
		@Test(priority=3)
		public void SignOff(){
			System.out.println("Login SuccessLogout from application");
		}
		//Post condition Annotations
		@AfterTest
		public void CloseBrowser(){
			System.out.println("Browser Closed");
		}
		
}


