@Listing
Feature: Product Listing Module

Scenario: Verify product listing visible
Given User is on Amazon home page
When User searches valid product "samsung phone"
Then Verify results page displayed
And Verify multiple products displayed

Scenario: Apply filters
Given User is on Amazon home page
When User searches valid product "samsung phone"
And User applies price filter
And User applies brand filter
Then Verify multiple products displayed

Scenario: Clear filters
Given User is on Amazon home page
When User searches valid product "samsung phone"
And User applies price filter
When User clears filters
Then Verify multiple products displayed
