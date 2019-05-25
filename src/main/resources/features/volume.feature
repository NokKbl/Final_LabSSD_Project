Feature: convert volume
    As a user
    I want to convert Volume from one unit to other unit

Scenario: Convert from Gallon to Litre
    When I convert Volume from 95.3 Gallon to Litre
    Then the unit result is 360.75

Scenario: Convert from Teaspoon to Millilitre
    When I convert Volume from 1203.5 Teaspoon to Millilitre
    Then the unit result is 5932.0

Scenario: Convert from Cubic_Kilometer to Cubic_Meter
    When I convert Volume from 483.2 Cubic_Kilometer to Cubic_Meter
    Then the unit result is 4.8320E11

Scenario: Convert from Gwian to Thang
    When I convert Volume from 800 Gwian to Thang
    Then the unit result is 80000

Scenario: Convert from Cubic_Meter to Gallon
    When I convert Volume from 485.1 Cubic_Meter to Gallon
    Then the unit result is 1.2815E05