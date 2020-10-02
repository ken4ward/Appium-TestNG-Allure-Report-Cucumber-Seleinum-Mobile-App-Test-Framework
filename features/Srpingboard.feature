@UATTesting
  Feature: Go to Google Page on Mobile browser at https://google.com

    Scenario: Input the Appium server URL
      Given I navigate to https://google.com
      And I fill in automation
      And I click the search button
      Then It should display the filled in details
