package com.baseclass.hcl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Select;

public class BaseClassSelenium {

	public static WebDriver driver;// nulldriver

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void sendValues(WebElement element, String values) {
		element.sendKeys(values);
	}

//public static void getCurrentUrl(WebElement element , String x) {
//String attribute = element.getAttribute(x);
//System.out.println(x);
//}
	public static void getURL(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void alert() {
		driver.switchTo().alert();

	}

	public static void action(WebElement element, String mouseActivity) throws Throwable {
		Actions ac = new Actions(driver);
		if (mouseActivity.equalsIgnoreCase("leftclick") || mouseActivity.equalsIgnoreCase("click")) {
			ac.moveToElement(element).build().perform();
			Thread.sleep(3000);
			ac.click(element).build().perform();
		} else if (mouseActivity.equalsIgnoreCase("rightclick")) {
			ac.moveToElement(element).build().perform();
			Thread.sleep(3000);
			ac.contextClick(element).build().perform();
		} else if (mouseActivity.equalsIgnoreCase("doubleclick")) {
			ac.moveToElement(element).build().perform();
			Thread.sleep(3000);
			ac.doubleClick(element).build().perform();
		} else if (mouseActivity.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		} else {
			System.out.println("***Unknown action***");
		}

	}

	public static void robot(String keyboardAction) throws AWTException {
		Robot r = new Robot();
		if (keyboardAction.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (keyboardAction.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		} else if (keyboardAction.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else {
			System.out.println("***Unknown Action***");
		}
	}

	public static void scrollTo(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void dropDown(WebElement element, String selectby, String value) {
		Select s = new Select(element);

		if (selectby.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (selectby.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (selectby.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}

	}

	public static void screenshot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\jerol\\eclipse-workspace\\SeleniumProject\\Screenshots\\youtube.png");
		FileUtils.copyFile(source, destination);
	}

	public static WebDriver BrowserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jerol\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "gecko driver path");
			driver = new FirefoxDriver();

		} else {
			System.out.println("***Invalid Browser***");
		}
		driver.manage().window().maximize();
		return driver;
	}

}
