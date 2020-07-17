package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KayakDate {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.com/horizon/sem/flights/general");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='Stuf']"));
		Thread.sleep(3000);
		
		String month ="February 2020";
		String date = "8";
		driver.findElement(By.xpath("//*[@id=c6a4-depart-input']")).click();
		
		
	}
	

}
