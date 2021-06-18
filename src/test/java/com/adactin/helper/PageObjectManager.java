package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.hcl.pomadactin.BookHotel;
import com.hcl.pomadactin.BookedItinerary;
import com.hcl.pomadactin.BookingConfirmation;
import com.hcl.pomadactin.LoginPage;
import com.hcl.pomadactin.SearchHotel;
import com.hcl.pomadactin.SelectHotel;

public class PageObjectManager {

//	public static LoginPage lp = new LoginPage(driver);
//	public static SearchHotel sh = new SearchHotel(driver);
//	public static SelectHotel page3 = new SelectHotel(driver);
//	public static BookHotel page4 = new BookHotel(driver);
//	public static BookingConfirmation page5 = new BookingConfirmation(driver);
//	public static BookedItinerary page6 = new BookedItinerary(driver);

	public WebDriver driver;

	private LoginPage login;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public LoginPage getInstanceLogin() {
		login = new LoginPage(driver);
		return login;

	}

	private SearchHotel search;

	public SearchHotel getInstanceSearch() {
		search = new SearchHotel(driver);
		return search;
	}

	private SelectHotel select;

	public SelectHotel getInstanceSelectHotel() {

		select = new SelectHotel(driver);
		return select;
	}

	private BookHotel book;

	public BookHotel getInstanceBookHotel() {
		book = new BookHotel(driver);
		return book;
	}

	private BookingConfirmation booking;

	public BookingConfirmation getInstanceBookingConfirmation() {
		booking = new BookingConfirmation(driver);
		return booking;
	}

	private BookedItinerary booked;

	public BookedItinerary getInstanceBookedItinerary() {
		booked = new BookedItinerary(driver);
		return booked;
	}

}
