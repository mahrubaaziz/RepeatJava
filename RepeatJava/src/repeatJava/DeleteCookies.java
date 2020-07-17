package repeatJava;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		//way1
		//driver.manage().deleteAllCookies();
		//way2
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().deleteCookieNamed("test@yahoo.com");//here we provide the value/argument, basically the locator value of the application
														//that we want to delete
		Set<Cookie> cookiesstorage = driver.manage().getCookies();
		for(Cookie getcookies:cookiesstorage){
			System.out.println(getcookies);
		}
	}
	

}
