Feature: Admin
Scenario: Add new Admin
Given User launch crome browser
When  user opens url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enters email id "Admin" and password "admin123"
And user click on login
Then Page source should contain "Dashboard"
When user click on Admin option
And click on add button
Then user can view add user menu
When user enters all details
And click on save button
Then user gets confimation message as "Successfully Saved"
And close the browser
