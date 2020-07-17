//4. Create a automation to handle username and password in your script where you are unable to
//Inspect the element. You can use the same url we have used in class.
package ActionItem_Dec2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
