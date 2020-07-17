package ActionItem_Dec2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculator {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");

	    	WebDriver driver = new ChromeDriver();
			driver.get("https://www.mortgagecalculator.org/");
			Thread.sleep(3000);
			driver.findElement(By.id("homeval")).sendKeys("500000");
			driver.findElement(By.id("downpayment")).sendKeys("100000");
			driver.findElement(By.name("param[downpayment_type]")).click();
			driver.findElement(By.id("loanamt")).sendKeys("240000");
			driver.findElement(By.id("intrstsrate")).sendKeys("2.8");
			
			driver.findElement(By.id("loanterm")).sendKeys("30");
			Select dropdown = new Select(driver.findElement(By.name("param[start_month]")));
			dropdown.selectByIndex(3);
			driver.findElement(By.id("start_year")).sendKeys("2020");
			driver.findElement(By.id("pptytax")).sendKeys("2600");
			driver.findElement(By.id("pmi")).sendKeys("0.5");
			driver.findElement(By.id("hoi")).sendKeys("1200");
			driver.findElement(By.id("hoa")).sendKeys("0");
			Select dropdown1 = new Select(driver.findElement(By.name("param[milserve]")));
			dropdown1.selectByVisibleText("FHA");
			Select dropdown2 =new Select(driver.findElement(By.name("param[refiorbuy]")));
			dropdown2.selectByVisibleText("Buy");
			Select dropdown3 =new Select(driver.findElement(By.id("credit_rating")));
			dropdown3.selectByVisibleText("Excellent (720+)");
			driver.findElement(By.name("cal")).click();
			
	}

}
