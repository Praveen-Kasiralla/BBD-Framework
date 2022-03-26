Feature: search property

Scenario: search property to buy open properties map
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on "buy"
And select "Mumbai" from city dropdown
Then select "1 BHK" and "Ready" from dropdown two and dropdown three
And enter "Colaba, Mumbai, Maharashtra, India" in search bar and click search
Then click on map option and make it fullscreen
And exit the browser