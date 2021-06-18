package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Adactin_Runner;
import com.baseclass.hcl.BaseClassSelenium;
import com.hcl.pomadactin.BookHotel;
import com.hcl.pomadactin.BookedItinerary;
import com.hcl.pomadactin.BookingConfirmation;
import com.hcl.pomadactin.LoginPage;
import com.hcl.pomadactin.SearchHotel;
import com.hcl.pomadactin.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Stepdefinition extends BaseClassSelenium {

	public static WebDriver driver = Adactin_Runner.driver;


	PageObjectManager pom =new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getURL(url);
	}

//	page1
	
	
	
	@When("^user Enter The \"([^\"]*)\" In The Username Textbox$")
	public void user_Enter_The_In_The_Username_Textbox(String username) throws Throwable {
		Thread.sleep(2000);
		sendValues(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Textbox$")
	public void user_Enter_The_In_The_Password_Textbox(String password) throws Throwable {
		sendValues(pom.getInstanceLogin().getPassword(), password);
	}


	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLoginButton());

	}

//	Page2

	@When("^user Select The Location From The Select Location Dropdown Box$")
	public void user_Select_The_Location_From_The_Select_Location_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getLocation(), "value", "Sydney");
	}

	@When("^user Select The Hotels From The Select Hotel Dropdown Box$")
	public void user_Select_The_Hotels_From_The_Select_Hotel_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getHotels(), "value", "Hotel Creek");
	}

	@When("^user Select The Room Type From Select Room Type Dropdown Box$")
	public void user_Select_The_Room_Type_From_Select_Room_Type_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getRoomType(), "value", "Deluxe");
	}

	@When("^user Select The Number Of Rooms From Number Dropdown Box$")
	public void user_Select_The_Number_Of_Rooms_From_Number_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getNumberOfRooms(), "value", "4");
	}

	@When("^user Enter The Check In Date In The Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
		sendValues(pom.getInstanceSearch().getCheckInDate(), "25/06/2021");
	}

	@When("^user Enter The Check Out Date In The Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
		sendValues(pom.getInstanceSearch().getCheckOutDate(), "26/06/2021");
	}

	@When("^user Select The Number Of Adults From The Adult Per Room Dropdown Box$")
	public void user_Select_The_Number_Of_Adults_From_The_Adult_Per_Room_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getNumberOfAdults(), "value", "1");
	}

	@When("^user Select The Number Of Children From The Children Per Room Dropdown Box$")
	public void user_Select_The_Number_Of_Children_From_The_Children_Per_Room_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceSearch().getNumberOfChildren(), "value", "0");
	}

	@Then("^user Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSubmit());
	}

//	Page3  

	@When("^user Select The Desired Hotel By Clicking On The Select Radio Button$")
	public void user_Select_The_Desired_Hotel_By_Clicking_On_The_Select_Radio_Button() throws Throwable {

		clickOnElement(pom.getInstanceSelectHotel().getRadioButton());
	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSelectHotel().getSubmitButton());
	}

//	Page4

	@When("^user Enter The First Name In The First Name Text Box$")
	public void user_Enter_The_First_Name_In_The_First_Name_Text_Box() throws Throwable {
		sendValues(pom.getInstanceBookHotel().getFirstName(), "Jerold");
	}

	@When("^user Enter The Last Name In The Last Name Text Box$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Text_Box() throws Throwable {
		sendValues(pom.getInstanceBookHotel().getLastName(), "KS");
	}

	@When("^user Enter The Billing Address In The Billing Address Text Box$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Text_Box() throws Throwable {
		sendValues(pom.getInstanceBookHotel().getBillingAddress(), "ABCD");
	}

	@When("^user Enter The Credit Card Number In The Credit Card No Text Box$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_No_Text_Box() throws Throwable {
		sendValues(pom.getInstanceBookHotel().getCreditCardNumber(), "1234567890123456");
	}

	@When("^user Select The Credit Card Type In The Credit Card Type Dropdown Box$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceBookHotel().getCreditCardType(), "value", "VISA");
	}

	@When("^user Select The Credit Card Expiry Month In The Expiry Date Month Dropdown Box$")
	public void user_Select_The_Credit_Card_Expiry_Month_In_The_Expiry_Date_Month_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceBookHotel().getExpiryDateMonth(), "value", "2");
	}

	@When("^user Select The Credit Card Expiry Year In The Expiry Date Year Dropdown Box$")
	public void user_Select_The_Credit_Card_Expiry_Year_In_The_Expiry_Date_Year_Dropdown_Box() throws Throwable {
		dropDown(pom.getInstanceBookHotel().getExpiryDateYear(), "value", "2022");
	}

	@When("^user Enter The Credit Card Cvv Number In The Cvv Text Box$")
	public void user_Enter_The_Credit_Card_Cvv_Number_In_The_Cvv_Text_Box() throws Throwable {
		sendValues(pom.getInstanceBookHotel().getCvvNumber(), "123");
	}

	@Then("^user Click On The BookNow Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_On_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getInstanceBookHotel().getBookNow());
		Thread.sleep(8000);
	}

//	page5

	@When("^user Click On The My Itinerary Button$")
	public void user_Click_On_The_My_Itinerary_Button() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(pom.getInstanceBookingConfirmation().getMyItinerary());
		Thread.sleep(2000);
	}

	@Then("^It Navigates To Booked Itinerary Page$")
	public void it_Navigates_To_Booked_Itinerary_Page() throws Throwable {
	}

// Page6

	@When("^user Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(pom.getInstanceBookedItinerary().getLogout());

	}

	@Then("^It Navigates To You Have Successfully Logged Out Click Here To Login Again Page$")
	public void it_Navigates_To_You_Have_Successfully_Logged_Out_Click_Here_To_Login_Again_Page() throws Throwable {
	}

}
