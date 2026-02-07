@Cart
Feature: Cart Module

Scenario: Add and remove product from cart
Given User is on Amazon home page
When User searches valid product "samsung phone"
And User opens first product details
And User adds product to cart
And User opens cart
Then Verify product added to cart
When User removes product from cart
