package repeatJava;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//this is arraylist collecting all the webelements, i am getting the info from driver,
		//getting the elements, trying to get the all of the elements so "" is empty
		//get input tag and store in list variable/obj number_Of_hiddenelements
		//array  elemenmts  objects
		List<WebElement>number_Of_hiddenelements = driver.findElements(By.tagName("input"));//input tag name is available every html or website
		//print total num of input tag
		System.out.println(number_Of_hiddenelements.size());
		for(int i=0;i<number_Of_hiddenelements.size();i++){
			
		//trim is to ignore the white space and get attribute is a method which allow us get the information from the web and return them
		//type is a default value
		//in page there are two type of attribute one is type and one is value we capture them all
			//Get all hidden element text
			if(number_Of_hiddenelements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")){
				//Check empty text
				if(!(number_Of_hiddenelements.get(i).getAttribute("value").trim().isEmpty())); //nested if
				//Print all hidden element text
				System.out.println("hidden element Text=" +i+""+number_Of_hiddenelements.get(i).getAttribute("value").trim());
				
				
			}
		}
	}

}
