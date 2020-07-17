package repeatJava;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class walgreenDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("https://www.walgreens.com/");
		//driver.manage().window().maximize();
		
		
		
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			for(int i = 0; i< links.size(); i++){
				//System.out.println(((WebElement) links.get(i)).getAttribute("href"));
				System.out.println(((WebElement) links.get(i)).getText());
			}
			
			
				
			
		
	}

}
