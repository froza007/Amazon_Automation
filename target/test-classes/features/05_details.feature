@Details
Feature: Product Details Module

Scenario: Verify product details page
Given User is on Amazon home page
When User searches valid product "samsung phone"
And User opens first product details
Then Verify product title visible
And Verify product price visible
And Verify product image visible
And Verify product description visible
