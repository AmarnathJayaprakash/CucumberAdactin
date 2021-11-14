$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the booking functionality of the Adactin hotel application",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User checking the login page with combinations of username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;1"
    },
    {
      "cells": [
        "Amarnath",
        "amar@123"
      ],
      "line": 11,
      "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;2"
    },
    {
      "cells": [
        "amarnath",
        "amaramarnath"
      ],
      "line": 12,
      "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;3"
    },
    {
      "cells": [
        "AmarnathJ",
        "AmarnathJ"
      ],
      "line": 13,
      "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User checking the login page with combinations of username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid \"Amarnath\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"amar@123\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_launch_the_application()"
});
formatter.result({
  "duration": 3028834100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amarnath",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 258714200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amar@123",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 123129200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 543695300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User checking the login page with combinations of username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid \"amarnath\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"amaramarnath\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_launch_the_application()"
});
formatter.result({
  "duration": 430828000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amarnath",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 105202300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amaramarnath",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 108119900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 501793300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User checking the login page with combinations of username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-with-combinations-of-username-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the valid \"AmarnathJ\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the valid \"AmarnathJ\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_launch_the_application()"
});
formatter.result({
  "duration": 433914100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AmarnathJ",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_username_field(String)"
});
formatter.result({
  "duration": 123417600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AmarnathJ",
      "offset": 22
    }
  ],
  "location": "AdactinStepdefiniton.user_enter_the_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 90280800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 2316398800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User navigate to hotel searching page and enter details of hotel required",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-hotel-searching-page-and-enter-details-of-hotel-required",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user navigate to hotel searching page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user select the Location",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user select the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select the Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select the No of Room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user enter the Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enter the Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user select the Adults per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select the Children per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user clicks on the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_navigate_to_hotel_searching_page()"
});
formatter.result({
  "duration": 51300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Location()"
});
formatter.result({
  "duration": 320161800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Hotel()"
});
formatter.result({
  "duration": 157881300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Room_Type()"
});
formatter.result({
  "duration": 152332100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_No_of_Room()"
});
formatter.result({
  "duration": 185529600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_Check_In_Date()"
});
formatter.result({
  "duration": 239006000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_Check_Out_Date()"
});
formatter.result({
  "duration": 173122300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Adults_per_Room()"
});
formatter.result({
  "duration": 160596300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Children_per_Room()"
});
formatter.result({
  "duration": 164106400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 814767500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User navigate to hotel booking page and book the specified hotel",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-hotel-booking-page-and-book-the-specified-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user naviagate to hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user select the Hotel room",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user clicks on the Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_naviagate_to_hotel_bookig_page()"
});
formatter.result({
  "duration": 83100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Hotel_room()"
});
formatter.result({
  "duration": 101611200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_Continue_button()"
});
formatter.result({
  "duration": 579752900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "User navigate to Payment confirmaion page and pay bill for booking room",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-payment-confirmaion-page-and-pay-bill-for-booking-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user navigate to payment confirmation page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user scroll down the page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user enter the First name",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enter the Last name",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enter the Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enter the Credit Card No",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user select the Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user select the Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user select the Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter the CCV Number",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user clicks on Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_navigate_to_payment_confirmation_page()"
});
formatter.result({
  "duration": 34800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_scroll_down_the_page()"
});
formatter.result({
  "duration": 34346800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_First_name()"
});
formatter.result({
  "duration": 100016500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_Last_name()"
});
formatter.result({
  "duration": 147243200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_Billing_Address()"
});
formatter.result({
  "duration": 142730800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_enter_the_Credit_Card_No()"
});
formatter.result({
  "duration": 120224500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Credit_Card_Type()"
});
formatter.result({
  "duration": 168030100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Expiry_Month()"
});
formatter.result({
  "duration": 170266100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_select_the_Expiry_Year()"
});
formatter.result({
  "duration": 157246100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_Enter_the_CCV_Number()"
});
formatter.result({
  "duration": 118551400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_Book_Now_button()"
});
formatter.result({
  "duration": 94441200,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User navigate to Booking Confirmation page",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "user navigate to booking confirmation page",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "user wait for a certain seconds",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "user scroll down page to my Itinerary button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user clicks on the button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_navigate_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_wait_for_a_certain_seconds()"
});
formatter.result({
  "duration": 5555179400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_scroll_down_page_to_my_Itinerary_button()"
});
formatter.result({
  "duration": 52150700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_the_button()"
});
formatter.result({
  "duration": 883278100,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "User navigate to Booked Itinerary page",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-navigate-to-booked-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "user navigate to itinerary page",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user take a Screenshot to this page",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user clicks on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdefiniton.user_navigate_to_itinerary_page()"
});
formatter.result({
  "duration": 35700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_take_a_Screenshot_to_this_page()"
});
formatter.result({
  "duration": 875474800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdefiniton.user_clicks_on_logout_button()"
});
formatter.result({
  "duration": 469375800,
  "status": "passed"
});
});