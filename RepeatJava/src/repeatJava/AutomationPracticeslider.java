package repeatJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeslider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=block_top_menu']/ul/li[3]/a")).click();
		
		//driver.navigate();
		//String currentTitle=driver.getTitle();
		//System.out.println(currentTitle.contains("T-shirts"));
		
		WebElement sliders= driver.findElement(By.xpath("//*[@id='layered_price_slider']/div"));
		
		Actions mouseclick=new Actions(driver); //action class allows us to hold mouse and key board action and perform action with some movement of the radius
		//                        source  x and y position
		//mouseclick.dragAndDropBy(sliders, 1583, 325 ).release().build().perform();
		//another method
		mouseclick.clickAndHold(sliders).moveByOffset(1134, 325).release().perform();
		sliders.click();
	}
}
