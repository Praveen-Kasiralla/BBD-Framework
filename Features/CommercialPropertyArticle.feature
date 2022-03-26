Feature: search property

Scenario: search property for commercial open property article
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on "commercial"
And select "Pune" from city dropdown
And click on "buy" radio button
Then select "Office Space" from dropdown
And enter "Kothrud, Pune, Maharashtra, India" in search bar and click search
Then click on a property from the result which will open in another tab
And click on the property photos
And exit the browser