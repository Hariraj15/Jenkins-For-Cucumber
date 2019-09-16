Feature: Tariff Two

  Background: 
    Given user should be in homepage.
    And user click on add tariff button

  Scenario: TariffTwo
    When user enter all fields with datas
      | 1000 | 100 | 50 | 200 | 20 | 80 | 10 |
      | 2000 | 500 | 90 | 200 | 10 | 60 | 90 |
      | 3000 | 300 | 60 | 200 | 20 | 50 | 10 |
    And user click on submit button.
    Then tariff plan should be displayed

  Scenario: TariffTwo
    When user enter all fields with datas
      | MR   | LM  | IM | SMS | LPMC | IPMC | SPC |
      | 1000 | 100 | 50 | 200 |   20 |   80 |  10 |
      | 2000 | 500 | 90 | 200 |   10 |   60 |  90 |
      | 3000 | 300 | 60 | 200 |   20 |   50 |  10 |
    And user click on submit button.
    Then tariff plan should be displayed

  Scenario Outline: TariffTwo
    When user enter all fields with datass"<MR>","<LM>","<IM>","<SMS>","<LPMC>","<IPMC>","<SPC>"
    And user click on submit button.
    Then tariff plan should be displayed

    Examples: 
      | MR   | LM  | IM | SMS | LPMC | IPMC | SPC |
      | 1000 | 100 | 50 | 200 |   20 |   80 |  10 |
      | 2000 | 500 | 90 | 200 |   10 |   60 |  90 |
      | 3000 | 300 | 60 | 200 |   20 |   50 |  10 |
