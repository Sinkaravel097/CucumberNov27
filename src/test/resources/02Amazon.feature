@Feature1
Feature: To validate the login functionality of amazon application

	@Smoke @Scenario1
  Scenario: To validate login with valid username and invalid password
    When To launch the amz application
    
    # One dimentional Map
    When To pass valid username in email field
      | emailone   | sql@gmail.com    |
      | emailtwo   | python@gmail.com |
      | emailthree | java@gmail.com   |
      
    And To click the continue button
    
    # Two dimentional Map
    And To enter the invalid password in password field
      | passone | passtwo      | passthree |
      | sql@123 | python@123   | java@123  |
      | 5687654 | cucumber@123 |   9764567 |
      
    And To click the signin button

        
    