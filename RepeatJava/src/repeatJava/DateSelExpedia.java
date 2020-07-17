package repeatJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelExpedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']")).click();
		Thread.sleep(3000);
		
		String mon = "Mar 2020";
		String date ="20";
		driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']")).click(); //calendar xpath mm/dd/yyyy box
		
		while(true){
			//this will get all the month and the year in string
			String text=driver.findElement(By.xpath("//caption")).getText(); //text of the 'Mar 2020'
			//text = Mar 2020 don't click on blue button but when I open calendar if  I don't see Mar 2020 then click on blue button
			if(text.equals(mon)){
				break;
			}
			else
				//xpath for date //*[@id="hotel-checkin-wrapper-hp-hotel"]/div/div/div[2]/table/tbody/tr/td/button
			{//here should be arrow xpaath
				driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/button[2]")).click(); //it will triger the arrow on the calendar
			}//here should be date xpth created  for all the date table
			List<WebElement>allCalDate=driver.findElements(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[3]/table/tbody/tr/td/button")); 
			for (WebElement elem:allCalDate)
			{			//we got the date here
				String date_value = (elem.getText()); //putting the date value in a string
				String day[]= date_value.split("\n"); //we split them
				//MArch = 0 date = 1 telling  to pick the one which is on 1 posiotion
				if(day[1].equals(date)){ //1 is our 1th psition of the array and tell to find the date untill date vaeriable
					
					elem.click();
					break;
				}
			}
			
		}
	}

}
