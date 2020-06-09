package practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutionConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\kusuma\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://freecrm.co.in/");
		 Thread.sleep(3000);
		 driver.findElementByXPath("//span[contains(text(),'Log In')]").click();
		 
		 driver.findElementByXPath("//input[@placeholder='E-mail address']").sendKeys("airwatch.sdkqa@gmail.com");
		 driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("Airwatch@123");
		 
		 
		//executeScript -- to execute JavaScript code
			
			WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")); //login button
			
			
			flash(loginBtn, driver); //highlight the element
			
//			drawBorder(loginBtn, driver); //draw a border
//			//take screenshot:
//			// Take screenshot and store as a file format
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			// now copy the screenshot to desired location using copyFile //method
//			FileUtils.copyFile(src, new File("C:\\Users\\kusuma\\Downloads\\element.png"));
//			
//			//generate Alert
//			//generateAlert(driver, "There is an issue with Login button on Login Page");
//			
//			//click on any element by using JS executor
//			clickElementByJS(loginBtn, driver);
//			
//			//refresh the page:
//			//1. by using selenium:
//			driver.navigate().refresh(); 
//			
//			//2. by using JS executor:
//			refreshBrowserByJS(driver);
//			
//			//get the tile of the page by JS:
//			System.out.println(getTitleByJS(driver));
//			
//			//get the page text:
//			System.out.println(getPageInnerText(driver));
//			
//			//scroll page down:
//			//scrollPageDown(driver);
//			
//			WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
//			scrollIntoView(forgotPwdLink, driver);
			
		}
		
		
		public static void flash(WebElement element, WebDriver driver) {
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        String bgcolor  = element.getCssValue("backgroundColor");
	        for (int i = 0; i <  10; i++) {
	            changeColor("rgb(0,200,0)", element,driver);//1
	            changeColor(bgcolor, element,driver);//2
	        }
	    }
	    public static void changeColor(String color, WebElement element, WebDriver driver) {
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(20);
	        }  catch (InterruptedException e) {
	        }
	     }
		
		
//	    public static void drawBorder(WebElement element, WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
//	    }
//	    
//	    public static void generateAlert(WebDriver driver, String message){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("alert('"+message+"')");
//
//	    }
//	    
//	    public static void clickElementByJS(WebElement element, WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("arguments[0].click();", element);
//	    	
//	    }
//		
//	    public static void refreshBrowserByJS(WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("history.go(0)");
//	    }
//	    
//	    public static String getTitleByJS(WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	String title = js.executeScript("return document.title;").toString();
//	    	return title;
//	    }
//	    
//	    public static String getPageInnerText(WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
//	    	return pageText;
//	    }
//	    
//	    public static void scrollPageDown(WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	    }
//	    
//	    public static void scrollIntoView(WebElement element, WebDriver driver){
//	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	    	js.executeScript("arguments[0].scrollIntoView(true);", element);
//	    }
		 
	}


