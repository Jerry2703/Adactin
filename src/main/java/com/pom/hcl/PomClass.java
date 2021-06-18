package com.pom.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	public PomClass(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement email;

	@FindBy(xpath = "(//input[@type='password'])")
	private WebElement password;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}

	@FindBy(xpath = ("//a[@title='Women']"))
	private WebElement women;

	@FindBy(xpath = ("(//a[@title='T-shirts'])[1]"))
	private WebElement tshirts;

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	

	

	@FindBy(xpath="(//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line'])[1]")
	private WebElement hover; 
	
	
	public WebElement getHover() {
		return hover;
	}
	
	@FindBy(xpath=("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]"))
	private WebElement addCart;

	public WebElement getAddCart() {
		return addCart;
	}
	
	
	public WebElement getProceedCheckout() {
		return proceedCheckout;
	}

	@FindBy(xpath="(//a[@class='btn btn-default button button-medium'])[1]")
	private WebElement proceedCheckout;
	
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order&step=1'])[1]")
	private WebElement proceedCheckout2;

	public WebElement getProceedCheckout2() {
		return proceedCheckout2;
	}
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSubmit2() {
		return submit2;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getFinalSubmit() {
		return finalSubmit;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit2;
	
	@FindBy(xpath="(//a[@class='bankwire'])")
	private WebElement payment;
	
	@FindBy(xpath="(//button[@class='button btn btn-default button-medium'])")
	private WebElement finalSubmit;
	
	
}

