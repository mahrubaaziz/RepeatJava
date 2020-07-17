package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HeadLessFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options); //this will get the title page with out opening the browser
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_f")).sendKeys("JOHN");
		driver.findElement(By.id("u_0_h")).sendKeys("DOE");
		driver.findElement(By.id("u_0_k")).sendKeys("jd123@yahoo.com");
		driver.findElement(By.id("u_0_p")).sendKeys("123jdpower");
		
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText("Jun");
		Thread.sleep(1000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("day")));
		dropdown1.selectByIndex(7);
		Thread.sleep(2000);
		
		Select dropdown2 = new Select(driver.findElement(By.id("year")));
		dropdown2.selectByVisibleText("1988");
		Thread.sleep(2000);
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		System.out.println("Title of the page is:" + driver.getTitle());
	}

}
