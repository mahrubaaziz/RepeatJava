package repeatJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverandClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();//we can put it here or after the url
				
				driver.get("https://www.mortgagecalculator.org/");
				//driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Actions action = new Actions(driver);
				//we use 'build' as we are building the action one after another 
				action.moveToElement(driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/a"))).build().perform();
				//we click on 10 years to see we are on correct landing page
				driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[1]/ul/li[4]/a")).click();
				
				System.out.println("Title page:"+ driver.getTitle());
				
				//div[@class]
				
				
			}
}
