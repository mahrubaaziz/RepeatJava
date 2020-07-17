package ActionItem_Dec2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNNHiddenLink {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("https://www.cnn.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
	}

}
