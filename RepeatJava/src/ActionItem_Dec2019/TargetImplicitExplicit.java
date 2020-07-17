package ActionItem_Dec2019;
//3. Create an automation for https://www.mortgagecalculator.org/ 
//or target.com or bestbuy.com using webelement, implicit and explicit wait concept. 
//Be sure create utility for each action which you are performing on the site.



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TargetImplicitExplicit {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//telling driver to manage timeout
		//implicitly wait 15 second to load the page
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.target.com/");
		
		WebElement search = driver.findElement(By.id("search"));
		
		SendKeys(driver,search,10,"Table lamp");
		
		WebElement button = driver.findElement(By.xpath("//*[@id='headerMain']/div/form/button[2]"));
		clickOn(driver,button,3);
  }
	//creating method for sendkeys and clickon
	public  static void SendKeys(WebDriver driver, WebElement element,int timeout, String value){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		//WebDriverWait used for explicitly wait
		
	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
