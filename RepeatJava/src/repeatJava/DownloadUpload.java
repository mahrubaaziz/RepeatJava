package repeatJava;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		//this is for upload
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='input-4']")).sendKeys("C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (22).png"); //this is the 
		//exact file path of the file we are uploading
		

    	/*this is for down load
    	 * WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html"); 
		
		driver.findElement(By.id("textbox")).sendKeys("Javasel");//for edit box we need to select download button for this will download as text 
		driver.findElement(By.id("createTxt")).click();// creating pdf
		
		driver.findElement(By.id("pdfbox")).sendKeys("Testing Sel");//for edit box for generate file
		driver.findElement(By.id("createPdf")).click();// creating pdf
		
		driver.findElement(By.id("pdf-link-to-download")).click(); //bottom download button will download as PDF*/
	}
	

}
