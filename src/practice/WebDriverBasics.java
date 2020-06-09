package practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("https://google.com");
       String title = driver.getTitle();
       System.out.println(title);
       if(title.equals("Google")) {
    	   System.out.println("correct title");
       }
       else {
    	   System.out.println("in-correct title");
       }
       System.out.println(driver.getCurrentUrl());
      // System.out.println(driver.getPageSource());
       driver.quit();
	}
}
