@Home
Feature: Home Page Module

Scenario: Verify home page elements
Given User is on Amazon home page
Then Verify search box present
And Verify category navigation menu present
And Verify banner section visible

Scenario: Handle location popup
Given User is on Amazon home page
When User handles location popup
