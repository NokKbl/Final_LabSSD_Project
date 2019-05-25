Feature: convert currency
    As a user
    I want to convert from Thai Baht to other currency

Scenario: Convert from THB to USD
    When I convert currency from 1500 THB: Thai Baht to USD: US Dollar
    Then the result is 46.50

Scenario: Convert from THB to CNY
    When I convert currency from 500 THB: Thai Baht to CNY: Chinese Yuan
    Then the result is 110.00

Scenario: Convert from THB to JPY
    When I convert currency from 483 THB: Thai Baht to JPY: Japanese Yen
    Then the result is 1661.52

Scenario: Convert from THB to KRW
    When I convert currency from 15800 THB: Thai Baht to KRW: Korean Won
    Then the result is 588392.00

Scenario: Convert from THB to HKD
    When I convert currency from 25000 THB: Thai Baht to HKD: Hong Kong Dollar
    Then the result is 6250.00