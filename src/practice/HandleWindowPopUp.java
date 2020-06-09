package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://www.popuptest.com/");
		 driver.findElementByXPath("//a[contains(text(),'Come & Go Test')]").click();
		// driver.findElementByXPath("/html[1]/body[1]/table[1]/tbody[1]/tr[2]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/font[3]/b[1]/a[1]").click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		//set object 
		String parrentwindowid=it.next();
		System.out.println("Parent Window Id"+ parrentwindowid);
		//move pointer to first location
		String childwindowid = it.next();
		System.out.println("Child Windo Id"+ childwindowid );
		//display title of popup window
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		System.out.println("Title of Child window popup is"+ driver.getTitle());
		driver.close();
		//display title of parent window
		driver.switchTo().window(parrentwindowid);
		Thread.sleep(2000);
		System.out.println("Title of Parent window popup is"+ driver.getTitle());
	
		
	}

}
