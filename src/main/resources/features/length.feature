Feature: convert length
    As a user
    I want to convert Length from one unit to other unit

Scenario: Convert from Meter to Centimeter
    When I convert Length from 40 Meter to Centimeter
    Then the unit result is 4000.0

Scenario: Convert from Kilometer to Yard
    When I convert Length from 58.2 Kilometer to Yard
    Then the unit result is 63648

Scenario: Convert from Inch to Centimeter
    When I convert Length from 83 Inch to Centimeter
    Then the unit result is 210.82

Scenario: Convert from Mile to Yod
    When I convert Length from 27 Mile to Yod
    Then the unit result is 2.7158

Scenario: Convert from Centimeter to Yard
    When I convert Length from 2534 Centimeter to Yard
    Then the unit result is 27.712