package WebDriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverArray {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		for(int i=0; i<=5; i++)
		{
			driver.get("https://google.com");
		}
	}

}
