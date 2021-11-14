package com.baseclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class BaseClass {
	public static WebDriver driver;

//*** WebDriver methods ***
	public static WebDriver browserLaunch(String str) {
	// 1) Select browser
		if(str.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Java\\TestNgMainProject\\ChromeDriverFolder\\chromedriver.exe");	
			driver = new ChromeDriver();	
		}
		else if(str.equalsIgnoreCase("gecko")){
			System.setProperty("webdriver.gecko.driver", "F:\\Java\\SeleniumOctProject\\driver\\firefoxdriver.exe");	
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser !!! , Check the Browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	// 2) get 
	public static void getPageUrl(String str) {
		driver.get(str);
	}
	// 3) pageTitle
	public static void getPageTitle() {
		String title = driver.getTitle(); 
		System.out.println(title);
	}
	// 4)  close    
	public static void closeTab() {
		driver.close();
	}
	// 5) quit   
	public static void quitBrowser() {
		driver.quit();
	}
// navigate methods 
	//1) navigate().to()   
	public static void toNavigate(String str) {
		driver.navigate().to(str);
	} 
	//2) navigate().back()
	public static void navigateBack() {
		driver.navigate().back();
	}
	//3) navigate().forward()  
	public static void navigateForward() {
		driver.navigate().forward();
	}
	// 4) navigate().refresh()  
	public static void pageRefresh() {
		driver.navigate().refresh();
	}

//*** WebElement Methods ***
	// 1) sendKeys 
	public static void toSendKeys(WebElement element, String str) {
		element.sendKeys(str);
	}
	// 2) Click
	public static void clickIt(WebElement element) {
		element.click();
	}
	// 3) isSelected	  	 
	public static void isItSelected(WebElement element) {
		if(!element.isSelected()) {
			clickIt(element);
		}
		else
			clickIt(element);
	}

	// 4) isEnabled	 
	public static boolean isItEnabled(WebElement element) {
		if (element.isEnabled()) {
			return true;
		}
		else
			return false;
	}
	// 5) isDisplayed
	public static boolean isItDisplayed(WebElement element) {
		if(element.isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	// 6) equals (Method of Object)
	public static boolean isEquals(String element1, String element2) {
		if(element1.equals(element2)) {
			return true;
		}
		else 
			return false;
	}

	// 7) clear
	public static void clearIt(WebElement element) {
		element.clear();
	}

//*** TakesScreenshot *** 
	public static void screenshotPic(String str) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\Java\\TestNgMainProject\\ScreenshotFolder\\"+str+".png"); 
		FileUtils.copyFile(source, destination);
	}

//*** Wait ***
	//1) Implicit wait	
	public static void waitImplicitly(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//2) Explicit wait
	public static void waitExplicit(WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

//***Select Methods ***
	//1) selectByValue
	public static void selectValue(WebElement element,String str) {
		Select s = new Select(element);
		s.selectByValue(str);
	}
	//2) selectByVisibleText
	public static void selectVisibleText(WebElement element,String str ) {
		Select s=new Select(element);
		s.selectByVisibleText(str);
	}

//***Actions Methods ***	
	//1)  moveToElement 	
	public static void moveToThatElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();   
	}
	//2) clickAndHold  
	public static void clickAndHoldIt(WebElement element) {
		Actions ac = new Actions(driver);
		ac.clickAndHold(element).build().perform();
	}
	//3) dragAndDrop
	public static void dragAndDropElements(WebElement ele1,WebElement ele2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(ele1,ele2).build().perform();
	}
	// 4) contextClick	   
	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	} 
	// 5) doubleClick     	   
	public static void doubleClickIt(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();	
	}

// *** Robot Class ***	   
	// 1) Enter 	      
	public static void clickEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}   
	// 2) moveDown	      
	public static void moveDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	// 3) moveUp	   
	public static void moveUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

// *** Frame Concepts	         
	// 1) switchToFrame         
	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	} 
	// 2) getBackFromFrame	         
	public static void getBackFromFrame() {
		driver.switchTo().defaultContent();
	} 

//*** JavascriptExecutor Methods
	//1)executeScript
	public static void scrolltoElement(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;       
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

//*** WindowHandles
	//1) getWindowHandle
	public static String singleWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	//2) getWindowHandles
	public static void switchToParticularWindow() {
		Set<String> windowHandles = driver.getWindowHandles();

		for (String window : windowHandles) {
			if (!window.equals(singleWindowHandle())) {
				driver.switchTo().window(window);
				break;
			}
		}
	}

// *** printStatement
	public static void toPrint(String str) {
		System.out.println(str);
	}	         








}
