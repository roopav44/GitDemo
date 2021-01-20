Feature: Application Login

@WebTest
Scenario: Home page default login
Given User is on NetBanking login page
When User login to application with "Jin" and password "1234"
Then Home page is populated
And Cards displayed "true"

@WebTest
Scenario: Home page default login
Given User is on NetBanking login page
When User login to application with "John" and password "4321"
Then Home page is populated
And Cards displayed "false"

@MobileTest
Scenario: Home page default login
Given User is on NetBanking login page
When User sign up with following details
| John | 1234 | Jin | 4321 | Jack | 9876 |
Then Home page is populated
And Cards displayed "false"
