package com.hcl.pomadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement loginButton;

	public LoginPage(WebDriver Adriver) {

		this.driver = Adriver;
		PageFactory.initElements(Adriver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
