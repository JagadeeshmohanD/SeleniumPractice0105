package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\kusuma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("window-size=1400,800");
		 options.addArguments("headless");
		 WebDriver driver = new ChromeDriver(options);
		 //driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 System.out.println("login page title"+ driver.getTitle());
	     
	}

}
