package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Software\\Workspace\\JavaPractice\\eclipse-workspace\\SeleniumPractice0105\\src\\practice\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("URL");
		System.out.println(url);
		String BrowserName=prop.getProperty("browser");
        System.out.println(BrowserName);
        if (BrowserName.equals("FireFox")){
   		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
   		 FirefoxDriver driver = new FirefoxDriver();
   		 driver.get(url);
   		 driver.findElementByXPath(prop.getProperty("register")).click();
   		 driver.findElementByXPath(prop.getProperty("firstname")).sendKeys(prop.getProperty("Firstname"));
   		 driver.findElementByXPath(prop.getProperty("lastname")).sendKeys(prop.getProperty("Lastname"));
   		 driver.findElementByXPath(prop.getProperty("email")).sendKeys(prop.getProperty("Email"));
        }
        else {
        	System.out.println("broser not found");
        }
       
	}

}
