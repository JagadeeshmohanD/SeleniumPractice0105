package practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://apple.com/");
		 //get the total count links on page
		 //get the total text on page
		 List <WebElement> linklist = driver.findElementsByTagName("a");
		 System.out.println(linklist.size());
		 for(int i=0; i<linklist.size(); i++) {
			 String linktext=linklist.get(i).getText();
			 System.out.println(linktext);
		 }
		 
	}

}
