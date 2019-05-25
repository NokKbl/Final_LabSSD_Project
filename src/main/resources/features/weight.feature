Feature: convert length
    As a user
    I want to convert Weight from one unit to other unit

Scenario: Convert from Kilogram to Metric_Ton
    When I convert Weight from 843.5 Kilogram to Metric_Ton
    Then the unit result is 0.84350

Scenario: Convert from Ounce to Gram
    When I convert Weight from 56.35 Ounce to Gram
    Then the unit result is 1597.5

Scenario: Convert from Stone to Kilogram
    When I convert Weight from 102.75 Stone to Kilogram
    Then the unit result is 652.49

Scenario: Convert from Milligram to Chung
    When I convert Weight from 8991.15 Milligram to Chung
    Then the unit result is 0.0074926

Scenario: Convert from Harb to Stone
    When I convert Weight from 436 Harb to Stone
    Then the unit result is 4119.5