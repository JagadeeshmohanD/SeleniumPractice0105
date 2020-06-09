package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 
		 //WebDriver driver = new HtmlUnitDriver();
		 //Headless browser
		 //fast and execute in background
		 //Not suitable for Action class
		 //WebDriver driver = new HtmlUnitDriver();
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://ui.cogmento.com/");
		 System.out.println("Befor login title"+driver.getTitle());
		// driver.findElement(By.name("email")).sendKeys("airwatch.sdkqa@gmail.com");
		driver.findElementByName("email").sendKeys("airwatch.sdkqa@gmail.com");
		 //driver.findElement(By.name("password")).sendKeys("Airwatch@123");
		driver.findElementByName("password").sendKeys("Airwatch@123");
		 //driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 driver.findElementByXPath("//div[@class='ui fluid large blue submit button']").click();
		 Thread.sleep(2000);
		 System.out.println("After login title"+driver.getTitle());
	}

}
