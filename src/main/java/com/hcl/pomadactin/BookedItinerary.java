package com.hcl.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelSelected;

	@FindBy(xpath = "//input[@name='search_hotel']")
	private WebElement searchHotel;

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public BookedItinerary(WebDriver Fdriver) {
		this.driver = Fdriver;
		PageFactory.initElements(Fdriver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getLogout() {
		return logout;
	}

}
