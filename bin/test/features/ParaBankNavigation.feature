@Navigation
Feature: Navigation menu
    To see the subpages
    Without logging in
    I can click the menu links

    # Pre step para cada Scenario
    Background: I am on the PARA BANK web without logging in.
        Given I navigate to www.parabank.parasoft.com

    # Scenarios
    Scenario Outline: I can access the subpages through the navigation menu
          When I go to <section> using the navigation menu
          Examples:
              | section     |
              | Services    |
              | Products    |
              | Locations   |
              

    @Products
    Scenario: Products are presented correctly   
        When I go to Products using the navigation menu
        Then I select Get Started


    Scenario: The user can change the language of the site
        When I go to Products using the navigation menu
        Then I select Get Started
        And I can validate the language options
    
    
        