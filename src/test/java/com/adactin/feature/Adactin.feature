Feature: Hotel Booking In Adactin Application

Scenario Outline: 

Given user Launch The Application 
When user Enter The "<username>" In The Username Textbox
And user Enter The "<password>" In The Password Textbox
Then user Click On The Login Button And It Navigates To Search Hotel Page

Examples:
|username|password|
|AAA|AAA1234|
|BBB|BBB1234|
|Jerry1234|Jerry@1234|

Scenario: 

When user Select The Location From The Select Location Dropdown Box
And user Select The Hotels From The Select Hotel Dropdown Box
And user Select The Room Type From Select Room Type Dropdown Box
And user Select The Number Of Rooms From Number Dropdown Box
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field 
And user Select The Number Of Adults From The Adult Per Room Dropdown Box
And user Select The Number Of Children From The Children Per Room Dropdown Box
Then user Click On The Search Button And It Navigates To Select Hotel Page


Scenario:

When user Select The Desired Hotel By Clicking On The Select Radio Button
Then user Click On The Continue Button And It Navigates To Book A Hotel Page

Scenario: 

When user Enter The First Name In The First Name Text Box
And user Enter The Last Name In The Last Name Text Box
And user Enter The Billing Address In The Billing Address Text Box
And user Enter The Credit Card Number In The Credit Card No Text Box
And user Select The Credit Card Type In The Credit Card Type Dropdown Box
And user Select The Credit Card Expiry Month In The Expiry Date Month Dropdown Box
And user Select The Credit Card Expiry Year In The Expiry Date Year Dropdown Box
And user Enter The Credit Card Cvv Number In The Cvv Text Box
Then user Click On The BookNow Button And It Navigates To Booking Confirmation Page

Scenario:

When user Click On The My Itinerary Button
Then It Navigates To Booked Itinerary Page

Scenario:

When user Click On The Logout Button
Then It Navigates To You Have Successfully Logged Out Click Here To Login Again Page







