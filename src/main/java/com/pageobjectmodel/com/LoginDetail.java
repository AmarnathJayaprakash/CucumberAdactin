package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetail {

	private static WebDriver driver;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement loginBtn;

	public LoginDetail(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
