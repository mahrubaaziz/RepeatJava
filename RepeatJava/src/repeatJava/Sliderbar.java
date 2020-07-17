package repeatJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("https://www.platerate.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement sliders= driver.findElement(By.xpath("//*[@id='form-search-basic']/div[2]/div/div[3]/input"));
		
		Actions mouseclick=new Actions(driver); //action class allows us to hold mouse and key board action and perform action with some movement of the radius
		//                        source  x and y position
		//mouseclick.dragAndDropBy(sliders, 500, 850).release().build().perform();
		//another method
		mouseclick.clickAndHold(sliders).moveByOffset(500, 850).release().perform();
		sliders.click();
	}

}
