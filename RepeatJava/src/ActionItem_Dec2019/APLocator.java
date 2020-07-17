package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APLocator {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("login")).click();//sign in  xpath //*[@id="header"]/div[2]/div/div/nav/div[1]/a
		//driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();//contact us 
		driver.findElement(By.id("email")).sendKeys("nebulajones@gmail.com");//email
		driver.findElement(By.name("passwd")).sendKeys("nebula123");//password
		driver.findElement(By.name("SubmitLogin")).click();//sign in (green)
		driver.findElement(By.name("search_query")).sendKeys("");//search box
		driver.findElement(By.name("submit_search")).click();//search icon
		
	}

}
