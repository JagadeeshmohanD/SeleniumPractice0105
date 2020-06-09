package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.rediff.com/");
		 driver.findElementByClassName("signin").click();
		 driver.findElementByName("proceed").click();
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 String text = alert.getText();
		 if(text.equals("Please enter a valid user name")){
			 System.out.println("correct alert message");
		 }
		 else {
			 System.out.println("in correct alert message");
		 }
		 alert.accept();
		 driver.close();
	}

}
