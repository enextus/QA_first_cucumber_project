




@negative
Scenario Outline: Login with wrong password
Given I am on the Homepage
When I click on the Login icon
Then I see Login page
When I insert user credentials
| email   | password   |
| <email> | <password> |
And I click on Login button
Then I should see error message
Examples:
| email            | password  |
| manuel@gmail.com |           |
| manuel@gmail.com | (*&*&^$%$ |