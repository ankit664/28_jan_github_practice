Feature: Login Action

Scenario: Successfull login with valid Credentials
Given User is on Home page
When User Navigate to Login PAge
And User enters Useranme and Password
Then message displayed Login Successfully 
 
 Scenario: Logout Successfully
 When User Logout from thye Application
 Then message displayed Logout Successfully 
 