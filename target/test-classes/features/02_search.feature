@Search
Feature: Search Module

Scenario: Valid search
Given User is on Amazon home page
When User searches valid product "iphone"
Then Verify results page displayed
And Verify products are listed

Scenario: Invalid search
Given User is on Amazon home page
When User searches invalid product "zzzzzzzz"
Then Verify results page displayed

Scenario: Special character search
Given User is on Amazon home page
When User searches special characters "@@@@"
Then Verify results page displayed
