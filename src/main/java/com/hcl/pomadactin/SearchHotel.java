package com.hcl.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement numberOfRooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement numberOfAdults;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement numberOfChildren;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement reset;

	public SearchHotel(WebDriver Bdriver) {
		this.driver = Bdriver;
		PageFactory.initElements(Bdriver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getNumberOfAdults() {
		return numberOfAdults;
	}

	public WebElement getNumberOfChildren() {
		return numberOfChildren;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}

}
