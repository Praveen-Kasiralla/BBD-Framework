Feature: search property

Scenario: search property to rent open property article
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on "rent"
And select "Bangalore" from city dropdown
And click on "full house" property type to rent
Then select "1 RK" and "Immediate" from dropdown two and dropdown three
And enter "Basavanagudi, Bengaluru, Karnataka, India" in search bar and click search
Then click on a property from the result which will open in another tab
And click on the property photos
And exit the browser