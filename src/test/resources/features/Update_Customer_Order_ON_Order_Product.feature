Feature: Customer Order ON Order Product
@Sanity
Scenario: Update Customer Order ON Order Product
Given I am on Landing page
When I click on Loging manu
Then I click on Customer Login Manu
Then I entered User Id "david@gmail.com"
And I entered Entered Password as "1234"
Then i clicked on Login button
Then i clicked on Order product
And i Select the product as Camera
Then I verify the order product
And I click on order product
Then i click on Confirm Button
And I verify my Confirmed Order
Then I loggedout from the site