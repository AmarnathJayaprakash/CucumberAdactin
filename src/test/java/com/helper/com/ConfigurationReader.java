package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	public ConfigurationReader() throws Throwable {
  
	File f = new File("F:\\Java\\TestNgMainProject\\src\\test\\java\\com\\properties\\com\\Testdata.properties");
	FileInputStream fis = new FileInputStream(f);
	p= new Properties();
	p.load(fis);
	}
	
	 public String getBrowser() {
        String browser = p.getProperty("Browser");
        return browser;
	}
	
	 public String getUrl() {
        String url = p.getProperty("Url");
	    return url;
	 }
	 
	 public String getLocationPlace() {
		 String locationPlace = p.getProperty("LocationPlace");
		 return locationPlace;
	}
	
	 public String getHotel() {
       String hotel = p.getProperty("Hotel");
       return hotel;
	}
	 
	 public String getRoomType() {
       String roomType = p.getProperty("RoomType");
       return roomType;
	}
	 
	public String getNoOfRooms() {
      String noOfRooms = p.getProperty("NoofRooms");
      return noOfRooms;
	} 
	
	public String getCheckInDate() {
        String checkIndate = p.getProperty("CheckInDate");
        return checkIndate;
	}
	
	public String getCheckOutDate() {
        String checkOutDate = p.getProperty("CheckOutDate");
        return checkOutDate;
	}
	 
	public String getAdultPerRoom() {
      String adultperRoom = p.getProperty("AdultsperRoom");
      return adultperRoom;
	} 
	 
	 public String getChildRoom() {
      String childRoom = p.getProperty("ChildRoom");
      return childRoom;
	}
	
	public String getAddress() {
      String address = p.getProperty("Address");
      return address;
	}
	
	public String getCreditCardNo() {
      String creditCardNo = p.getProperty("Creditcardno");
      return creditCardNo;
	}
	
	public String getCardType() {
      String cardType = p.getProperty("CardType");
	   return cardType;
	}
	
      public String getExpiryMonth() {
       String expiryMonth = p.getProperty("ExpiryMonth");
	    return expiryMonth;
      }
      
      public String getExpiryYear() {
        String expiryYear = p.getProperty("ExpiryYear");
	    return expiryYear;
      }
     
      public String getCcvNo() {
       String ccvNo = p.getProperty("CCVno");
       return ccvNo;
	}
      
      public String getScreenshot() {
      String screenshot = p.getProperty("Screenshot");
	  return screenshot;
      }
}
