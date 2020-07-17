package repeatJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldClockTable {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
			
			
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.timeanddate.com/worldclock/full.html");
	  
	  WebElement tables = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
	  
	  List<WebElement>rows=tables.findElements(By.tagName("tr"));
	  
	  for(int i =0; i<rows.size(); i++){
		  List<WebElement>column=rows.get(i).findElements(By.tagName("td"));
		  
		  for(int j=0; j<column.size(); j++){
			  System.out.println(column.get(j).getText());
		  }
	  }
			
			
		}
}
