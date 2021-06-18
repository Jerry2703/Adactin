package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.baseclass.hcl.BaseClassSelenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//adactin//feature", glue ="com.adactin.stepdefinition")
public class Adactin_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClassSelenium.BrowserLaunch(browser);
	}

	@AfterClass

	public static void tearDown() {
//		driver.close();
	}

}
