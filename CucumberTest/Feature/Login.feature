Feature: Verify login page

Background:
    Given user launch the browser and amazon application  

Scenario Outline: login functionality
    When user enter "<username>" and "<password>"
    Then user clicks login button
    Then user verify homepage
    
    Examples:
    |username|password|
    |hello|12345|
    |hi|67|
    |haha|890|
    