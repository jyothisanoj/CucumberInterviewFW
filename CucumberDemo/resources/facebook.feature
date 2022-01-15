Feature: Login into the application

Scenario: Login with valid username and valid password
Given user enter into textbox "username" "jyothi"
And user enter into textbox "password" "jyothi1"
When user clicks loginButton
Then user is in homepage

