
Feature: Feature to test google search functionality
Scenario: validate google search is working

Given browser is open
And user is on google serch page
When user enters a text in search input
And user clicks enter key
Then user is navigated to the search results