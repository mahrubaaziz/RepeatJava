//3.2 Use Mouse hover, scroll & verify the footer. 


package ActionItem_Dec2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverandScrollMortgage {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		//building the action one after another
		action.moveToElement(driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[2]/a"))).build().perform();
		driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[2]/ul/li[3]/a")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//calling the driver
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrolling down from 0th position to vertically
		
	}

}
