package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomator extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.findElementByAndroidUIAutomator("attribute(\"value\")").c
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //validate clickable feature
	}

}
