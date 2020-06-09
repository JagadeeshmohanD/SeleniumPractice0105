package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static <WebElement> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 driver.findElementById("lst-ib").sendKeys("Testing");
		 List<org.openqa.selenium.WebElement> list = driver.findElementsByXPath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']");
			
			System.out.println("total number of suggestions in search box:::===>" + list.size());
			
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("java tutorial")){
					list.get(i).click();
					break;
				}
			}
			

	}

}
