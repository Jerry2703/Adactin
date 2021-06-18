package com.hcl.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement searchHotel;

	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement myItinerary;

	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement logout;

	public BookingConfirmation(WebDriver Edriver) {
		this.driver = Edriver;
		PageFactory.initElements(Edriver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

}
