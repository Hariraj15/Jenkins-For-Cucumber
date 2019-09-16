Feature: Customer Flow

  Background: 
    Given user should be in homepage
    And user click on add customerbutton

  Scenario: Add Customer
    When user enter all fields with valid data
      | Hari      | Raj   | hariraj.mv@gmail.com   | Medavakkam   | 9894730181 |
      | Rajesh    | kumar | rajseh.mv@gmail.com    | Pallikaranai | 9894730568 |
      | HariHaran | Raj   | hariraj.mv@gmail.com   | Chromepet    | 9894730185 |
      | vinodh    | Raj   | vinodhraj.mv@gmail.com | Madipakkam   | 9894787859 |
    And user click submit button
    Then user sucessful message is displayed

  Scenario: Add Customer
    When user enter all fields with valid datas.
      | fname     | lname | email                  | address      | phoneno    |
      | Hari      | Raj   | hariraj.mv@gmail.com   | Medavakkam   | 9894730181 |
      | Rajesh    | kumar | rajseh.mv@gmail.com    | Pallikaranai | 9894730568 |
      | HariHaran | Raj   | hariraj.mv@gmail.com   | Chromepet    | 9894730185 |
      | vinodh    | Raj   | vinodhraj.mv@gmail.com | Madipakkam   | 9894787859 |
    And user click submit button
    Then user sucessful message is displayed

  Scenario Outline: Add Customer
    When user enter all fields with valid datass."<fname>","<lname>","<email>","<address>","<phoneno>"
    And user click submit button
    Then user sucessful message is displayed

    Examples: 
      | fname     | lname | email                  | address      | phoneno    |
      | Hari      | Raj   | hariraj.mv@gmail.com   | Medavakkam   | 9894730181 |
      | Rajesh    | kumar | rajseh.mv@gmail.com    | Pallikaranai | 9894730568 |
      | HariHaran | Raj   | hariraj.mv@gmail.com   | Chromepet    | 9894730185 |
      | vinodh    | Raj   | vinodhraj.mv@gmail.com | Madipakkam   | 9894787859 |
