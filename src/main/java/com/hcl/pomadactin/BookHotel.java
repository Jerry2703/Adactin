package com.hcl.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement firstName;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billingAddress;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement creditCardNumber;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditCardType;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryDateMonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryDateYear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement bookNow;

//	@FindBy(xpath = "//input[@name='cancel']")
//	private WebElement cancel;

	public BookHotel(WebDriver Ddriver) {
		this.driver = Ddriver;
		PageFactory.initElements(Ddriver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryDateMonth() {
		return expiryDateMonth;
	}

	public WebElement getExpiryDateYear() {
		return expiryDateYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

//	public WebElement getCancel() {
//		return cancel;
//	}

}
