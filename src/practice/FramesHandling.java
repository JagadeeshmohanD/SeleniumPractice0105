package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://freecrm.co.in/");
		 driver.findElementByXPath("//@[contains(text(),'btn-icon-left')]").click();
		 driver.findElementByName("email").sendKeys("airwatch.sdkqa@gmail.com");
		 driver.findElementByName("password").sendKeys("Airwatch@123");
		 driver.findElementByXPath("//input[@type='submit']").click();
	}

}
