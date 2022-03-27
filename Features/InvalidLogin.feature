Feature: Log In

Scenario: Login with invalid details
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on Login
Then enter phone number "7989463999" select password method
And enter invalid password "8sdf89" and click on continue
And exit the browser