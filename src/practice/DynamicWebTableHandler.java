package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandler {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://freecrm.co.in/");
		 Thread.sleep(3000);
		 driver.findElementByXPath("//span[@class='icon icon-xs mdi-chart-bar']").click();
		 driver.findElementByName("email").sendKeys("airwatch.sdkqa@gmail.com");
		 driver.findElementByName("password").sendKeys("Airwatch@123");
		 driver.findElementByXPath("//div[@class='ui fluid large blue submit button']").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//span[contains(text(),'Contacts')]").click();
		 Thread.sleep(3000);
//		 String Before_Xpath = "//tr[";
//		 String After_Xpath = "]//td[1]//div[1]//label[1]";
//		 
//		 for (int i=1;i<4;i++) {
//			String name= driver.findElementByXPath(Before_Xpath+i+After_Xpath).getText();
//			System.out.println(name);
//			if(name.contains("bank bank")){
//				driver.findElementByXPath("//tr["+i+"]//td[1]//div[1]//label[1]").click();
//			}
//		 }
		 
		 driver.findElementByXPath("//td[contains(text(),'bank bank bank')]").click();
		 driver.findElementByXPath("//td[contains(text(),'clap clap clap')]").click();
		

	}

}
