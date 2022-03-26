Feature: search property

Scenario: search property to buy open properties map
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on "commercial"
And select "Pune" from city dropdown
And click on "buy" radio button
Then select "Office Space" from dropdown
And enter "Kothrud, Pune, Maharashtra, India" in search bar and click search
Then click on map option and make it fullscreen
And exit the browser