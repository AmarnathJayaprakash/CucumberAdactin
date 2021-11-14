package com.projectclass.com;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.baseclass.com.BaseClass;
import com.pageobjectmodel.com.BookingDetail;
import com.pageobjectmodel.com.LoginDetail;
import com.pageobjectmodel.com.LogoutDetail;
public class AdactinHotelBooking extends BaseClass {
	public static WebDriver driver;
    public LoginDetail ld;
	public BookingDetail bd ;
	public  LogoutDetail lod;
	@Test
	private void loginPage() {
		driver = browserLaunch("chrome");
		getPageUrl("http://adactinhotelapp.com/");
		 ld = new LoginDetail(driver);
		toSendKeys(ld.getUserName(), "AmarnathJ"); 
		toSendKeys(ld.getPassword(), "AmarnathJ");
		clickIt(ld.getLoginBtn());
	}
	@Test(dependsOnMethods = "loginPage")
	private void bookingPage() {
	    bd = new BookingDetail(driver);
		selectVisibleText(bd.getLocation(), "London");
		selectValue(bd.getHotels(), "Hotel Hervey");
		selectVisibleText(bd.getRoomType(), "Super Deluxe");
		selectValue(bd.getNoOfRooms(), "2");
		clearIt(bd.getCheckInDate());
		toSendKeys(bd.getCheckInDate(), "2/11/2021");
		clearIt(bd.getCheckOutDate());
		toSendKeys(bd.getCheckOutDate(), "6/11/2021");
		selectValue(bd.getAdultsPerRoom(), "4");
		selectValue(bd.getChildRoom(), "1");
		clickIt(bd.getSearchBtn());
	}
	@Test(dependsOnMethods = "bookingPage")
	private void logoutPage() throws IOException {
        lod= new LogoutDetail(driver);
		clickIt(lod.getRadioButton());
		clickIt(lod.getContinueBtn());
		scrolltoElement(lod.getFirstName());
		toSendKeys(lod.getFirstName(), "Amarnath");
		toSendKeys(lod.getLastName(), "Jayaprakash");
		toSendKeys(lod.getAddress(), "No.123, ABC street,Newyork");
		toSendKeys(lod.getCreditCardNo(), "1234567890987654");
		selectVisibleText(lod.getCardType(), "VISA");
		selectValue(lod.getMonth(), "2");
		selectValue(lod.getYear(), "2022");
		toSendKeys(lod.getCcvNo(), "321");
		clickIt(lod.getRegisterBtn());
		waitExplicit(lod.getItinerary(),6);
		scrolltoElement(lod.getItinerary());
		clickIt(lod.getItinerary());
		screenshotPic("mybookingroom");
		clickIt(lod.getLogout());
		closeTab();
	}
	@Test(dependsOnMethods = "logoutPage")
	private void projectDone() {
      toPrint("Project Done Sucessfully !!!");
	}
}