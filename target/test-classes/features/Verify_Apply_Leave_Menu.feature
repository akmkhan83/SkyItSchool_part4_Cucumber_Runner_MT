Feature: Verify the Employee Apply Leave Menu funcionality
@Sanity @Regression
Scenario: Verify apply Leave menu Bar
Given I am on Landing Page
Then I click on Loging bar
Then I Enter user Id as "testpilot@gmaol.com"
And I Enter Password as 1234
Then I Click On Loging Button
Then T click On Apply Leave Menu bar
Then I put The Reason anr Duration
Then I verify the Leave Reason(Last Click Asserton)
































































































































