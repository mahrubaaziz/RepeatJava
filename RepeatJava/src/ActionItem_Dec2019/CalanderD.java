//4. Create a program that will allow you to read from a calendar.  
//Click on a specific date from a month(ex. booking.com). 
//Click Flight+hotel 1st and then choose a date
package ActionItem_Dec2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderD {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='cross-product-bar']/div[1]/a[2]/span[2]")).click();
		
		String mon = "February 2020";
		String date = "29";
		
		driver.findElement(By.xpath("//*[@id='frm']/div/div[3]/div[1]/div[2]/div/div/div/div/span")).click();
		
		Thread.sleep(3000);
		
		while(true){
			String text=driver.findElement(By.xpath("//*[@class='bui-calendar__month']")).getText();
			
			if(text.equals(mon)){
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='frm']/div/div[3]/div[2]/div/div/div[2]")).click();
			}
			
			List<WebElement> allCalDate= driver.findElements(By.xpath("//*[@id='frm']/div/div[3]/div[2]/div/div/div[3]/div[1]/table/tbody/tr/td"));
			for(WebElement elem:allCalDate)
			{
				String Month_value=(elem.getText());
				String datevalue[]= Month_value.split("\n");
			
			if(datevalue[0].equals(date)){
				
				elem.click();
				break;
				
			}
			}
		}
		
	}

}
