package ActionItem_Dec2019;
//6. Create an Automation which will perform the following:
//A. Launch the Browser
//B. Go to Amazon website
//C. Enter an item in the search field
//D. Search for that item

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchItem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.className("s-image")).click();
		Thread.sleep(2000);
}
}