package com.hcl.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.baseclass.hcl.BaseClassSelenium;
import com.pom.hcl.PomClass;


public class FinalMiniProject extends BaseClassSelenium {

	public static void main(String[] args) throws Throwable {
		BrowserLaunch("chrome");
		getURL("http://automationpractice.com/index.php");
	PomClass pc =new PomClass(driver);

		clickOnElement(pc.getLogin());
		Thread.sleep(3000);

		sendValues(pc.getEmail(), "abcxyz@test.com");
		sendValues(pc.getPassword(), "Jerry@12345");
		clickOnElement(pc.getButton());
		Thread.sleep(3000);

		action(pc.getWomen(), "movetoelement");

		action(pc.getTshirts(), "movetoelement");
		action(pc.getTshirts(), "leftclick");

		Thread.sleep(3000);
		action(pc.getHover(),"movetoelement");

		clickOnElement(pc.getAddCart());
		Thread.sleep(3000);
		clickOnElement(pc.getProceedCheckout());
		Thread.sleep(3000);
		clickOnElement(pc.getProceedCheckout2());
		Thread.sleep(3000);

		clickOnElement(pc.getSubmit());
		Thread.sleep(3000);

	
		System.out.println("Is the checkbox enabled??" + pc.getCheckbox().isEnabled());
		action(pc.getCheckbox(), "movetoelement");
		action(pc.getCheckbox(), "click");

		clickOnElement(pc.getSubmit2());
		Thread.sleep(3000);

		clickOnElement(pc.getPayment());
		Thread.sleep(3000);

		clickOnElement(pc.getFinalSubmit());

	}
}
