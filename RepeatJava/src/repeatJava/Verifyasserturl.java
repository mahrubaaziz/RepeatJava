package repeatJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyasserturl {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//Verify
			//String currentTitle=driver.getCurrentUrl();//these are the two method we can use
			String currentTitle=driver.getTitle();
			
			
			System.out.println(currentTitle.contains("Facebook"));

	//Assert
		if(currentTitle.contains("Facebook"))
		{
			System.out.println("Validation 1:Passed - Title is working");
		}
		else
		{
			System.out.println("Validation 1: Failed- Title is not working");
		}
		

   }
}