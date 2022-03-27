Feature: Log In

Scenario: Login with valid details
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on Login
Then enter phone number "7989463999" select password method
And enter valid password "Chandhu@1" and click on continue
And exit the browser