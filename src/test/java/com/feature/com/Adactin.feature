Feature: Checking the booking functionality of the Adactin hotel application

Scenario Outline: User checking the login page with combinations of username and password
Given user launch the application
When user enter the valid "<username>" in the username field
And user enter the valid "<password>" in the password field
Then user clicks on the login button

Examples:
| username| password |
| Amarnath | amar@123 |
| amarnath | amaramarnath |
| AmarnathJ | AmarnathJ |

Scenario: User navigate to hotel searching page and enter details of hotel required
Given user navigate to hotel searching page
When user select the Location
And user select the Hotel
And user select the Room Type
And user select the No of Room
And user enter the Check In Date
And user enter the Check Out Date
And user select the Adults per Room
And user select the Children per Room
Then user clicks on the search button

Scenario: User navigate to hotel booking page and book the specified hotel
Given user naviagate to hotel booking page
When user select the Hotel room
Then user clicks on the Continue button

Scenario: User navigate to Payment confirmaion page and pay bill for booking room
Given user navigate to payment confirmation page
When user scroll down the page
And user enter the First name
And user enter the Last name
And user enter the Billing Address
And user enter the Credit Card No
And user select the Credit Card Type
And user select the Expiry Month
And user select the Expiry Year
And user Enter the CCV Number
Then user clicks on Book Now button 

Scenario: User navigate to Booking Confirmation page 
Given user navigate to booking confirmation page
When user wait for a certain seconds
And  user scroll down page to my Itinerary button 
Then user clicks on the button

Scenario: User navigate to Booked Itinerary page
Given user navigate to itinerary page
When user take a Screenshot to this page
Then user clicks on logout button