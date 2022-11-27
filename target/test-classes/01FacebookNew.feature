@Feature2
Feature: To validate the login functionality in fb application

	@Sanity @Scenario1
  Scenario: To validate with invalid username and invalid password
    When User has to launch the fb application in browser
    And User has to pass invalid username in email field
    And User has to pass invalid password in password field
    And User has to click the login button
    
	@Regression @Scenario2 @Scenario50 
  Scenario Outline: To validate the positive and negative combination in login field
    When User has the launch the url
    And To pass the bulk of "<emailfield>" datas to email field
    And To pass the bulk of datas to password "<passfield>" field
    And To click the login button

    Examples: 
      | emailfield         | passfield  |
      | selenium@gmail.com | sel@123    |
      | java@gmail.com     | java@123   |
      | python@gmail.com   | python@123 |
      | sql@gmail.com      | sql@123    |

      