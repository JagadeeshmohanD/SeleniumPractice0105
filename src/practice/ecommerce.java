package practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ecommerce {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
				File F = new File("src");
				File fs = new File(F,"General-Store.apk");
				DesiredCapabilities cap = new DesiredCapabilities();
			
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6P");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8);
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
				//cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
				cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\kusuma\\Downloads\\General-Store.apk");
				cap.setCapability("chromedriverExecutable", "C:\\Users\\kusuma\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
				AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				return driver;
	}

}
