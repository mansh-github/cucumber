Feature: Login into Application

Scenario Outline: Verification of Login Function  

Given Initilize the browser with chrome
And Navigate to "https://www.flipkart.com/" Site
And user on the Login Page
And user click on login button
And user enters <username> and <password> and logs in
And user click "log in" button
Then user should see "My Account"

Examples:
|username    |password |
|8983844553  |Him@nshu77990|
