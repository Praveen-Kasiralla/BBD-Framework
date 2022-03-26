Feature: Emi calculator

Scenario: click on emi calculator in footer and calculate emi
Given initialize the "chrome" browser
Then navigate to "https://www.nobroker.in/" website
And click on Emi calculator in footer which will open in next tab
Then enter "200040" loan amount
And enter "10" rate of interest
Then enter "30" loan tenure
And see the emi output
And exit the browser