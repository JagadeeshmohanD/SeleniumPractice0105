package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 FirefoxDriver driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 
			 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.get("https://book.spicejet.com/");
			 Thread.sleep(3000);
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElementByXPath("//*[@id=\"highlight-addons\"]")).build().perform();
			 Thread.sleep(3000);
             driver.findElementByLinkText("Visa Services").click();
             Thread.sleep(3000);
             Alert alert = driver.switchTo().alert();
             alert.accept();
	}

}
