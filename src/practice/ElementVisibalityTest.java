package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibalityTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://freecrm.co.in/");
		 Thread.sleep(3000);
		boolean b1 = driver.findElementByXPath("//span[@class='icon icon-xs mdi-chart-bar']").isDisplayed();
        System.out.println(b1);
	}

}
