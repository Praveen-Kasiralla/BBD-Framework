Feature: search property

Scenario: search property to buy open property article
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on "buy"
And select "Mumbai" from city dropdown
Then select "1 BHK" and "Ready" from dropdown two and dropdown three
And enter "Colaba, Mumbai, Maharashtra, India" in search bar and click search
Then click on a property from the result which will open in another tab
And click on the property photos
And exit the browser