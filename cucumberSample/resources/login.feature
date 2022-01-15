Feature: Login into application

Scenario: Login with valid username and valid password
Given user enters value into textBox "username" "jyothi"
And user enters value into textBox "password" "jyothi1"
When user clicks "loginButton"
Then user verify the textvalue "headerText" "expected"
