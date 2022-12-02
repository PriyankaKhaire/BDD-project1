#Author
#Date
#Scenario

Feature: Amazon Search

Scenario: Search a product

Given i have search field on amazon page
When i search for product with name "apple phone" and price 25000
Then product with name "apple phone" should be displayed

