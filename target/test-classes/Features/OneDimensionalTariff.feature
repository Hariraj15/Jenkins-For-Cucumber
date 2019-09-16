Feature: Tariff flow

  Scenario: Add Tariff
    Given user should be in home page
    And user click on add tariff
    When user should enter all tariff fields with valid data
    And user click on submit button at the bottom
    Then user tariff plan successful is displayed

  Scenario: Add Tariff
    Given user should be in home page
    And user click on add tariff
    When user should enter all tariff fields with valid data.
      | 1000 | 200 | 100 | 10 | 30 | 100 | 10 |
    And user click on submit button at the bottom
    Then user tariff plan successful is displayed

  Scenario: Add Tariff
    Given user should be in home page
    And user click on add tariff
    When user should enter all tariff fields with valid datas.
      | rental           | 1000 |
      | local min        |  200 |
      | inter min        |  100 |
      | sms pack         |   10 |
      | local min charge |   30 |
      | inter min charge |  100 |
      | sms per charge   |   10 |
    And user click on submit button at the bottom
    Then user tariff plan successful is displayed
