//4. Create an Automation script for the following?
//go to https://www.flipkart.com/
//Search for mobiles
//interact with the sliderbar for the price

package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_Slidebar {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/mobile-phones-store");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement slidebar = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div[1]/div[1]/div/section[2]/div[3]/div[1]/div[4]"));
		
		Actions mouseclick = new Actions(driver);//action class allows to hold mouse and perform action with movement
		
		mouseclick.clickAndHold().moveByOffset(26, 383).release().perform();
		slidebar.click();
	}

}
