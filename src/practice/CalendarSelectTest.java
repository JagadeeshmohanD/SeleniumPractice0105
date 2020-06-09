package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
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
		 driver.findElementByXPath("//span[contains(text(),'Calendar')]").click();
		 Thread.sleep(3000);
		 String date ="04-September-2019";
		 String dateArr[]= date.split(".");
		 String day = dateArr[0];
		 String month = dateArr[1];
		 String year = dateArr[2];
		 String beforeXpath = "\r\n" + 
		 		"//body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[contains(@class,'ui fluid container')]/div[@class='ui fluid container main-content']/div[@class='calendar-container']/div[@class='ui segment calendar-wrapper']/div[@class='rbc-calendar']/div[@class='rbc-month-view']/div[";
			String afterXpath = "]/div[1]/div[1]";
			
			final int totalWeekDays = 7;
			
			//2-1 2-2 2-3 2-4 2-5 2-6 2-7
			//3-2 3-2 3-3 3-4 3-5 3-6 3-7
			boolean flag = false;
			String dayVal = null;
			for(int rowNum=2; rowNum<=7; rowNum++){
				
				for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				   dayVal =driver.findElementByXPath(beforeXpath+rowNum+afterXpath+colNum+"]").getText();
					System.out.println(dayVal);
					}
			}
	}

	}
