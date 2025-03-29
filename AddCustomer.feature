Feature: Add a new customer

  Scenario Outline: Validate adding new customers
    Given User is logged in
    When User navigates to "Add Customer" page
    And Enters "<customerName>", "<email>", "<phone>"
    And Clicks "Save" button
    Then Customer should be added successfully

  Examples:
    | customerName | email               | phone       |
    | John Doe    | john@example.com    | 9876543210  |
    | Alice       | alice@mail.com      | 9123456789  |
