Feature: Contatc Us

Scenario: click on about us in footer and goto Twitter
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on About Us in footer
Then click on home loan which will open another tab
And exit the browser