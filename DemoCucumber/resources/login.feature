Feature: Login into application

Scenario: Login with valid userid and valid password

Given User is on "LoginPage"
When User enters value into textbox "username" "jyothi"
And User enters value into textbox "password" "jyothi1"
And User clicks "LoginButton"
Then User validates the text "errmsg" "Please enter valid userid"