package repeatJava;
//go to jet.com
//retrieve all image urls
//get the total count
//tagname for images=img
//attribute = src
//rows =tr
//column= td

//1. Create a program which will allow you to retrieve all the image urls &amp; get the total count?
//https://jet.com/



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JetImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://jet.com/");
		  Thread.sleep(3000);
		  
		//this list collecting all the webelements images
		  List<WebElement>number_of_images=driver.findElements(By.tagName("img"));
		  System.out.println(number_of_images.size()); //printing total number of imges
	
		  
		  
		  for(int i=0; i<number_of_images.size(); i++){
			  
			  System.out.println(number_of_images.get(i).getAttribute("src"));// print all the image links
			  
			  }
		  
	}

}
