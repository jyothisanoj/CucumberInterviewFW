Feature: Login into facebook

Scenario: Login with valid user id and password

Given user enters "userid" "jyothi"
And user enters "password" "jyothi1"
When clicks "Login" button
Then user enters HomePage
