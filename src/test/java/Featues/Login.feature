Feature: Login

  Scenario: Sucess login with valid credential
    Given User launch crome browser
    When  user opens url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enters email id "Admin" and password "admin123"
    And user click on login
    Then Page source should contain "Dashboard"
    When user click on logout
    Then page title should be "OrangeHRM"
    And close the browser
