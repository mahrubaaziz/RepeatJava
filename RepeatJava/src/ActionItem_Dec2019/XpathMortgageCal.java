package ActionItem_Dec2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMortgageCal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
	}

}
