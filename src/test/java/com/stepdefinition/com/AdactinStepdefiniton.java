package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;
import com.helper.com.FileReaderManager;
import com.pageobjectmanager.com.POM;
import com.runner.com.AdactinRunner;

import cucumber.api.java.en.*;

public class AdactinStepdefiniton extends BaseClass {
	public static WebDriver driver=AdactinRunner.driver;
	
	POM pom =new POM(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	 String url = FileReaderManager.getInstanceCR().getUrl();
		getPageUrl(url);   
	}

	@When("^user enter the valid \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_in_the_username_field(String arg1) throws Throwable {
	  toSendKeys(pom.getLd().getUserName(), arg1); 
	}

	@When("^user enter the valid \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_in_the_password_field(String arg1) throws Throwable {
	   toSendKeys(pom.getLd().getPassword(),arg1);
	}
	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	  clickIt(pom.getLd().getLoginBtn());   
	}
	@Given("^user navigate to hotel searching page$")
	public void user_navigate_to_hotel_searching_page() throws Throwable {

	}
	@When("^user select the Location$")
	public void user_select_the_Location() throws Throwable {
       String locationPlace= FileReaderManager.getInstanceCR().getLocationPlace();
		selectVisibleText(pom.getBd().getLocation(),locationPlace);
	}
	@When("^user select the Hotel$")
	public void user_select_the_Hotel() throws Throwable {
		String hotel = FileReaderManager.getInstanceCR().getHotel();
		selectValue(pom.getBd().getHotels(), hotel);
	}
	@When("^user select the Room Type$")
	public void user_select_the_Room_Type() throws Throwable {
		String roomType = FileReaderManager.getInstanceCR().getRoomType();
		selectVisibleText(pom.getBd().getRoomType(), roomType);
	}
	@When("^user select the No of Room$")
	public void user_select_the_No_of_Room() throws Throwable {
		String noOfRooms = FileReaderManager.getInstanceCR().getNoOfRooms();
		selectValue(pom.getBd().getNoOfRooms(), noOfRooms);
	}
	@When("^user enter the Check In Date$")
	public void user_enter_the_Check_In_Date() throws Throwable {
		clearIt(pom.getBd().getCheckInDate());
		String checkInDate = FileReaderManager.getInstanceCR().getCheckInDate();
		toSendKeys(pom.getBd().getCheckInDate(), checkInDate);
	}
	@When("^user enter the Check Out Date$")
	public void user_enter_the_Check_Out_Date() throws Throwable {
		clearIt(pom.getBd().getCheckOutDate());
		String checkOutDate = FileReaderManager.getInstanceCR().getCheckOutDate();
		toSendKeys(pom.getBd().getCheckOutDate(),checkOutDate);
	}
	@When("^user select the Adults per Room$")
	public void user_select_the_Adults_per_Room() throws Throwable {
		String adultPerRoom = FileReaderManager.getInstanceCR().getAdultPerRoom();
		selectValue(pom.getBd().getAdultsPerRoom(), adultPerRoom);
	}
	@When("^user select the Children per Room$")
	public void user_select_the_Children_per_Room() throws Throwable {
		String childRoom = FileReaderManager.getInstanceCR().getChildRoom();
		selectValue(pom.getBd().getChildRoom(), childRoom);
	}
	@Then("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
		clickIt(pom.getBd().getSearchBtn());
	}
	@Given("^user naviagate to hotel booking page$")
	public void user_naviagate_to_hotel_bookig_page() throws Throwable {

	}
	@When("^user select the Hotel room$")
	public void user_select_the_Hotel_room() throws Throwable {
		clickIt(pom.getLod().getRadioButton());
	}

	@Then("^user clicks on the Continue button$")
	public void user_clicks_on_the_Continue_button() throws Throwable {
		clickIt(pom.getLod().getContinueBtn());
	}
	@Given("^user navigate to payment confirmation page$")
	public void user_navigate_to_payment_confirmation_page() throws Throwable {

	}
	@When("^user scroll down the page$")
	public void user_scroll_down_the_page() throws Throwable {
		scrolltoElement(pom.getLod().getFirstName());
	}

	@When("^user enter the First name$")
	public void user_enter_the_First_name() throws Throwable {
		toSendKeys(pom.getLod().getFirstName(), "Amarnath");
	}
	@When("^user enter the Last name$")
	public void user_enter_the_Last_name() throws Throwable {
		toSendKeys(pom.getLod().getLastName(), "Jayaprakash");
	}
	@When("^user enter the Billing Address$")
	public void user_enter_the_Billing_Address() throws Throwable {
		String address = FileReaderManager.getInstanceCR().getAddress();
		toSendKeys(pom.getLod().getAddress(), address);
	}
	@When("^user enter the Credit Card No$")
	public void user_enter_the_Credit_Card_No() throws Throwable {
		String creditCardNo = FileReaderManager.getInstanceCR().getCreditCardNo();
		toSendKeys(pom.getLod().getCreditCardNo(), creditCardNo);
	}
	@When("^user select the Credit Card Type$")
	public void user_select_the_Credit_Card_Type() throws Throwable {
		String cardType = FileReaderManager.getInstanceCR().getCardType();
		selectVisibleText(pom.getLod().getCardType(), cardType);
	}
	@When("^user select the Expiry Month$")
	public void user_select_the_Expiry_Month() throws Throwable {
		String expiryMonth = FileReaderManager.getInstanceCR().getExpiryMonth();
		selectValue(pom.getLod().getMonth(), expiryMonth);
	}
	@When("^user select the Expiry Year$")
	public void user_select_the_Expiry_Year() throws Throwable {
		String expiryYear = FileReaderManager.getInstanceCR().getExpiryYear();
		selectValue(pom.getLod().getYear(), expiryYear);
	}
	@When("^user Enter the CCV Number$")
	public void user_Enter_the_CCV_Number() throws Throwable {
		String ccvNo = FileReaderManager.getInstanceCR().getCcvNo();
		toSendKeys(pom.getLod().getCcvNo(), ccvNo);
	}
	@Then("^user clicks on Book Now button$")
	public void user_clicks_on_Book_Now_button() throws Throwable {
		clickIt(pom.getLod().getRegisterBtn());
	}
	@Given("^user navigate to booking confirmation page$")
	public void user_navigate_to_booking_confirmation_page() throws Throwable {

	}
	@When("^user wait for a certain seconds$")
	public void user_wait_for_a_certain_seconds() throws Throwable {
		waitExplicit(pom.getLod().getItinerary(),6);
	}

	@When("^user scroll down page to my Itinerary button$")
	public void user_scroll_down_page_to_my_Itinerary_button() throws Throwable {
		scrolltoElement(pom.getLod().getItinerary());
	}

	@Then("^user clicks on the button$")
	public void user_clicks_on_the_button() throws Throwable {
		clickIt(pom.getLod().getItinerary());
	}
	@Given("^user navigate to itinerary page$")
	public void user_navigate_to_itinerary_page() throws Throwable {

	}
	@When("^user take a Screenshot to this page$")
	public void user_take_a_Screenshot_to_this_page() throws Throwable {
		String screenshot = FileReaderManager.getInstanceCR().getScreenshot();
		screenshotPic(screenshot);
	}

	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
		clickIt(pom.getLod().getLogout());
	}

}
