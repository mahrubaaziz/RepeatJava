package repeatJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitVExpliciW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Implicit wait is always applied globally--for all webelement
		//present in the script
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//find by locator id="mnnbb"
		//find by name
		
		WebElement FirstName=driver.findElement(By.id("u_0_f"));// this is another way
		WebElement LastName=driver.findElement(By.id("u_0_h"));
		
		SendKeys(driver,FirstName,10, "Mahruba");
		SendKeys(driver,LastName,20, "Aziz");
		
		WebElement ForgotLink = driver.findElement(By.linkText("Forgot account?"));
		clickOn(driver,ForgotLink, 3);
		
		//driver.findElement(By.id("u_0_f")).sendKeys("JOHN");
		//driver.findElement(By.id("u_0_h")).sendKeys("DOE");
	}
	public static void SendKeys(WebDriver driver,WebElement locators, int timeout, String value){ 
		//Explicit wait doesn't have any command like implicit wait that indicates
		//it's an explicit wait.
		//(WebDriverWait) is used for explicit wait.
		//Waits for particular element or action to take place.It's condition based.
		//it must have a condition****
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(locators));
		locators.sendKeys(value);
	}
		
		public static void clickOn(WebDriver driver, WebElement elements, int timeout){
			new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(elements));
			elements.click();
		}
		
		
	}


