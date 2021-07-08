Feature: Sconto Login Feature
  In order to see the error message

@wrongLogin
  Scenario: (Our Goal)  Login with wrong password
    Given I am on the homepage
    When I click on the login icon  (Anmelden)
    Then I see login page

    When I insert valid user credentials
    |email        |password|
    |aaaa@aaa.aaa |wrong|
    And I click on Login button
    Then I should see MyAccount icon
