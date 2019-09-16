Feature: Customer flow
@smoke
  Scenario: New Customer flow
    #Given user should be in telecom home page
    And user click on add customer button
    When user should enter all the fields with valid data
    And user click on submit button
    Then user customer id is generated and displayed

  Scenario: New Customer flow
    Given user should be in telecom home page
    And user click on add customer button
    When user should enter all the fields with valid data.
      | Hari | Raj | hariraj.mv@gmail.com | Medavakkam chennai | 9894730181 |
    And user click on submit button
    Then user customer id is generated and displayed

  Scenario: New Customer flow
    Given user should be in telecom home page
    And user click on add customer button
    When user should enter all the fields with valid datas.
      | fname   | java              |
      | lname   | Raj               |
      | mail    | java.mv@gmail.com |
      | address | chennai           |
      | phoneno |        8894730181 |
    And user click on submit button
    Then user customer id is generated and displayed
