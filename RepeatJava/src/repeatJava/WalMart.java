package repeatJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WalMart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='vh-header']/div/div[1]/button/span/span")).click();
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='vh-department-menu']/button[2]"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id='dept-level1-item-1-children']/div[2]/div[2]/div[3]/a[1]/div")).click();
		
		
		List<WebElement> price=  driver.findElements(By.xpath("//span[@class='price-characteristic']"));
		
		
		for(WebElement elem:price){
			
			String p =elem.getText();
			int value =Integer.parseInt(p);
			if(value<25){		
			System.out.println(p);
		}else{
			System.out.println("Price is over $25");
		}
		
	}	
		
	}
				
			
		
}
		
	


