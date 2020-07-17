package ActionItem_Dec2019;
//2. Create a program which will allow you to retrieve all the hidden links and the total count?
//https://cnn.com/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNNLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://cnn.com/");
		  Thread.sleep(3000);
		  
		//This arraylist collecting all the webelements, a is global tagname for links
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println(links.size()); //printing total number of links
		  
		  for(int i=0; i<links.size(); i++){
			  System.out.println(links.get(i).getAttribute("href")); //getting all links and printing them
		  }
	}

}
