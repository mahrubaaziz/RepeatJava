package repeatJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFramework {
	WebDriver driver;
	
	@BeforeTest()
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println("Open a new browsere");
	}

	@Test(priority=0)
	public void Signup(){
		System.out.println("New User should sign up successfully");
		
	}
	
	@Test(priority=1, description= "This should execute first")
	public void Signin(){
		System.out.println("User should sign in");
	}
	
	@Test(priority=3)
	public void ChangeDoB(){
		System.out.println("Date of Birth has been changed");
	}
	
	@Test(priority=2)
	public void ChangeSchool(){
		System.out.println("User should able to change the school name");
	}
	
	@Test(priority=4)
	public void SendEmail(){
		System.out.println("Email sent to the Team");
	}
	
	@Test(priority=5)
	public void Signout(){
		System.out.println("User should sign out successfully");
	}
	
	@AfterTest
	public void CloseBrowser(){
		System.out.println("Browser Closed");
	}
}
