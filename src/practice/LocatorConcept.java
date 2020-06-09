package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
     driver.findElementByXPath("//*[@id=\"firstname\"]").sendKeys("Apple");
     driver.findElementByXPath("//*[@id=\"lastname\"]").sendKeys("ios");
     driver.findElementByXPath("//*[@id=\"email\"]").sendKeys("abc123@abcair.com");
     driver.findElementByXPath("//*[@id=\"PASSWORD\"]").sendKeys("Apple@123");
	}

}
