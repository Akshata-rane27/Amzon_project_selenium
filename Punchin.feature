Feature: Validate Punch-In Toast Message

  Scenario: Verify toast message after punch-in
    Given User is logged in
    When User clicks on "Punch In" button
    Then A toast message should be displayed with "Punch-in Successful"
