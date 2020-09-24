Feature: As a user,I should be able to select any selenium locators from feature file 

@forumLoginPage
Scenario Outline: As a OSA's user,I should be able to log into  OSA's Forum .

    Given I want to navigate to My OSA home Page
    
    When I want to click on Forum login button
          |xpath|//a[text()="Forum Login"]|
        # |MyDataFileRead.xlsx|cssSelector|C2|
    Then I verify the Forum Login Page Title
             |Forum Login|         
    Then I enter the username for forum login
             |id|username|<username>|
    Then I enter the password for forum login
             |id|password|<password>|
    Then I click on login button
             |xpath|//button[@id="login_button"]|
    Then I am closing the browser
    Examples:
          |username|password|
          |user1   |pass1|
          |user2   |pass2|