package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutDetail {

public static WebDriver driver;
	
	@FindBy(css="input#radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@class='select_combobox2']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvNo;
	
	@FindBy(css="input.reg_button")
	private WebElement registerBtn;
		
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout;
	
	public LogoutDetail(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver2, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}
	
	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	
}
