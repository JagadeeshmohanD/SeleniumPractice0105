package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://apple.com/");
		 driver.navigate().to("https://google.com");
		 driver.navigate().to("https://amazon.com");
		 //back and forward simulation
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 driver.quit();

	}

}
