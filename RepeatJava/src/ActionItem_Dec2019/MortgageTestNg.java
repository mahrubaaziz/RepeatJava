//3.1 Create an Automation script using testng for mortgagecalculator. 
//Use all the features from testng we have learned so far. 
package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MortgageTestNg {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
	}
	
	@Test(enabled = true, priority = 1, description="This is a mandatory step")
	public void HomeValue(){
		
		driver.findElement(By.id("homeval")).sendKeys("500000");
		driver.findElement(By.id("downpayment")).sendKeys("100000");
		driver.findElement(By.name("param[downpayment_type]")).click();
		driver.findElement(By.id("loanamt")).sendKeys("240000");
		driver.findElement(By.id("intrstsrate")).sendKeys("2.8");
	}
	
	@Test(enabled = true, priority = 2, description="This is a mandatory step")
	public void loanTerm(){	
		driver.findElement(By.id("loanterm")).sendKeys("30");
		Select dropdown = new Select(driver.findElement(By.name("param[start_month]")));
		dropdown.selectByIndex(3);
		driver.findElement(By.id("start_year")).sendKeys("2020");
		driver.findElement(By.id("pptytax")).sendKeys("2600");
		driver.findElement(By.id("pmi")).sendKeys("0.5");
		driver.findElement(By.id("hoi")).sendKeys("1200");
		driver.findElement(By.id("hoa")).sendKeys("0");
	}
	
	@Test(enabled = true, priority = 0, description="This is a mandatory step", testName="Smoke")
	public void creditScore(){
		Select dropdown1 = new Select(driver.findElement(By.name("param[milserve]")));
		dropdown1.selectByVisibleText("FHA");
		Select dropdown2 =new Select(driver.findElement(By.name("param[refiorbuy]")));
		dropdown2.selectByVisibleText("Buy");
		Select dropdown3 =new Select(driver.findElement(By.id("credit_rating")));
		dropdown3.selectByVisibleText("Excellent (720+)");
	}
	
	@Test(priority = 3)
	public void calculateButton() throws InterruptedException{
		driver.findElement(By.name("cal")).click();
		Thread.sleep(5000);
		
		//Used Abs XPath to retrieve the value.
		String totalValue = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/form[1]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/h3[1]")).getText();
		System.out.println(totalValue);
	
	}
		
	@AfterTest
	public void CloseBrowser(){
		driver.close();
	}
	

}
