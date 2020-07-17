package repeatJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//we can put it here or after the url
		
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable")); //value for the drag me to my target
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver); //ation class in selenium we are calling to perform some action and we are telling 
		//action class to perform with the driver beacause it does not know which driver I am working with
		
		action.clickAndHold(drag).moveToElement(drop).release().build().perform(); //as we know the spesific  element we are moving
		//and where we are moving to
		
		
	}

}
