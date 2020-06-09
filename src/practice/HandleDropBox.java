package practice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.airtel.in/prepaid-tariff");
		 driver.findElementByLinkText("CHANGE").click();
		 Select select = new Select(driver.findElementById("topElement"));
		 select.selectByVisibleText("Karnataka");

	}

}
