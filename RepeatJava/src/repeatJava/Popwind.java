package repeatJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popwind {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//handling the login admin:admin one is (username:password@)
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//verifying the congratz text
		String PMS = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		System.out.println(PMS);
		
	
	
	}

}

