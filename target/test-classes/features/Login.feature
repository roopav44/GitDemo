Feature: Application Login

Background:
Given Validate the browser 
When Browser is triggered
Then Check if browser has started

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking login page
When User login to application with "Jin" and password "1234"
Then Home page is populated
And Cards displayed "true"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking login page
When User login to application with "John" and password "4321"
Then Home page is populated
And Cards displayed "false"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking login page
When User sign up with following details
| John | 1234 | Jin | 4321 | Jack | 9876 |
Then Home page is populated
And Cards displayed "false"

@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking login page
When User log in to application with <username> and <password>
Then Home page is populated
And Cards displayed "true"

Examples: 
|username |password |
|user1    |pass1    |
|user2    |pass2    |
|user3    |pass3    |
|user4    |pass4    |
