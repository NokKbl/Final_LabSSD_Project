Feature: convert temperature
    As a user
    I want to convert Temperature from one unit to other unit

Scenario: Convert from Celsius to Rankine_Scale
    When I convert Temperature from 13 Celsius to Rankine_Scale
    Then the unit result is 515.07

Scenario: Convert from Kelvin to Delisle_Scale
    When I convert Temperature from 130 Kelvin to Delisle_Scale
    Then the unit result is 364.72

Scenario: Convert from Rankine_Scale to Fahrenheit
    When I convert Temperature from 1307 Rankine_Scale to Fahrenheit
    Then the unit result is 847.33

Scenario: Convert from Fahrenheit to Kelvin
    When I convert Temperature from 2507 Fahrenheit to Kelvin
    Then the unit result is 1648.2

Scenario: Convert from Delisle_Scale to Celsius
    When I convert Temperature from 2007 Delisle_Scale to Celsius
    Then the unit result is -1238.0