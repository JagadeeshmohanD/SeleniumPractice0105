package practice;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://apple.com/");
		 File sfc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FilenameUtils.copyFile(sfc, new File("C:\\Users\\kusuma\\Desktop\\apple.png"));
	}

}
