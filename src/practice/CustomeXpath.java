package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.ebay.com/");
		 //driver.findElementByXPath("//*[@id=\"gh-ac\"]").sendKeys("apple");
		 //driver.findElementByXPath("//input[@id='gh-ac']").sendKeys("java");//created xpath
		 driver.findElementByXPath("//input[@name='_nkw']").sendKeys("hello");
		 driver.findElementByXPath("//a[contains(text(),'Home & Garden')]").click();

	}

}
