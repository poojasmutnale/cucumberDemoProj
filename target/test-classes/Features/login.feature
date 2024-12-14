@SmokeFeature
Feature: Feature to test login functionality
    @smoketest
    Scenario: Check login successful with valid credentials
        Given user is on login page
        When user enters valid username and password
        And clicks on login button
        Then user is navigated to home page


  #Scenario Outline: Check login succesfull with valid credentials
    #Given user is on login page
    #When user enters valid <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username  | password    |
      #| username1 | username123 |
      #| username2 | username234 |
