package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadlessTestNGFB {
	WebDriver driver;
	
	@BeforeTest
	public void browserOpen(){
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
          System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		driver = new ChromeDriver(options); //this will get the title page with out opening the browser
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=0)
	public void signUp(){
		driver.findElement(By.id("u_0_f")).sendKeys("JOHN");
		driver.findElement(By.id("u_0_h")).sendKeys("DOE");
		driver.findElement(By.id("u_0_k")).sendKeys("jd123@yahoo.com");
		driver.findElement(By.id("u_0_p")).sendKeys("123jdpower");
	}
	
	@Test
	public void dropDown(){
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText("Jun");
		
	}
	@AfterTest
	public void closingBrowser(){
		
	}

}
