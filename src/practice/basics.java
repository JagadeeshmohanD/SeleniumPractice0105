package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.HomePage;
import pageObject.Preferences;

public class basics extends HybridBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver =capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
		
		//constructor of that call will be invoked when you create an object of that class
		//constructor can be defined with arguments
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		h.preferences.click();
		//you can call the objects or variables of the class withclass object
		Preferences p =new Preferences(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		p.dependencies.click();
		//driver.findElementById("android:id/checkbox").click();
		p.checkbox.click();
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		p.RelativeLayout.click();
		//driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		p.EnterText.sendKeys("hello");
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		p.buttons.get(1).click();


		

	}

}
