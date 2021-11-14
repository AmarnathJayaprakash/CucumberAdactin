package com.pageobjectmanager.com;

import org.openqa.selenium.WebDriver;
import com.pageobjectmodel.com.BookingDetail;
import com.pageobjectmodel.com.LoginDetail;
import com.pageobjectmodel.com.LogoutDetail;

public class POM {

	public static WebDriver driver;
	private LoginDetail ld;
	private BookingDetail bd;
	private LogoutDetail lod;

	public POM(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginDetail getLd() {
		ld = new LoginDetail(driver);
		return ld;
	}

	public BookingDetail getBd() {
		bd = new BookingDetail(driver);
		return bd;
	}

	public LogoutDetail getLod() {
		lod = new LogoutDetail(driver);
		return lod;
	}

}
