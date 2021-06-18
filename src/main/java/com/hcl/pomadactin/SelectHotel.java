package com.hcl.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {


	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radioButton;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelButton;
	
	
	public SelectHotel(WebDriver Cdriver) {

	this.driver=Cdriver;
	PageFactory.initElements(Cdriver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	
	
	
	
	
	
}
