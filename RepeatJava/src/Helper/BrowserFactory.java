package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory { //it's a storage class for browser
	static WebDriver driver; //we can make it static if we want to
	
	 public static WebDriver startBrowser(String browserName, String urls) // we can declare as a static method if we want to
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(urls);//create a variable for url calling that
		return driver;//as we created obj for the WeDriver
	}

}
