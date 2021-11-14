package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetail {

	public static WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(css="input#datepick_in")
	private WebElement checkInDate;
	
	@FindBy(css="input#datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(css="input.reg_button")
	private WebElement searchBtn;
	
	public BookingDetail(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver, this);
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

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}
