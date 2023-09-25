Feature: Login

  Scenario: Successfull Login With valid credentials
    Given User launches Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce Administration
    When User click on Log out link
    Then Page Title Should be "Your Store. Login"
    And Close browser


