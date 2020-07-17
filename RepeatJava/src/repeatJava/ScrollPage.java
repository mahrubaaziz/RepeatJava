package repeatJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/"); // we did with amazon, djcity, bestbuy
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //calling driver
		
		//1-pixel
		//js.executeScript("window.scrollBy(0,1000)","");//we find the pixel through page rular wth amazomi
		
		//2- using element
		//WebElement social = driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[2]/div[1]/div[3]/a/span/i"));
		//js.executeScript("arguments[0].scrollIntoView();",social);  we did djcity
		
		//3- bottom of the page           it mean from 0th position   //document .body.... mean value of the page untill the height
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //with bestbuy
	} 

}
