package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://html.com/input-type-file/");
		 driver.findElementByXPath("//input[@id='fileupload']")
		 .sendKeys("C:\\Users\\kusuma\\Desktop\\Skill set.txt");
	}

}
