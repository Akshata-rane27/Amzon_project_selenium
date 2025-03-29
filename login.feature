Feature: Validate login page

  Scenario Outline: To check login page with valid and invalid credentials
    Given login page should be open in default browser
    When click on emailid field then enter "<username11>"
    And go to password and enter "<password11>"
    Then Signin "<status>"

    Examples: 
      | username11                      | password11 | status |
      | siddiqshaikh1@nimapinfotech.com | admin@123  | Fail   |
      | ytetr                           | password   | Fail   |
      |                                 | password   | Fail   |
      | siddiqshaikh1@nimapinfotech.com | ysytyusar  | Fail   |
      | siddiqshaikh1@nimapinfotech.com | kiu        | Fail   |
      | siddiqshaikh1@nimapinfotech.com |            | Fail   |
      | fyut                            | iuoio      | Fail   |
