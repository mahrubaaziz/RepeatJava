package repeatJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

    	WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/"); // we did with amazon, djcity, bestbuy
		//driver.manage().window().maximize();
		
		System.out.println("Title Page:"+driver.getTitle());
	}

}
