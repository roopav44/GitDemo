Feature: Search and place order for vegetables

@SmokeTest
Scenario: Search for items and validate results
Given User is in the GreenKart landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@RegressionTest
Scenario: Search for items and validate results
Given User is in the GreenKart landing page
When User searched for "Brinjal" vegetable
And Added items to the cart
And Proceed to checkout page for purchase
Then verify selected "Brinjal" items are displayed in the checkout page

@SeleniumTest2
Scenario Outline: Search for items and validate results
Given User is in the GreenKart landing page
When User searched for <name> vegetables
Then <name> vegetable result is displayed

Examples: 
|name	 |
|cucumber|
|brinjal |