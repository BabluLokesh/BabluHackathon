Feature: OpenBookshelves

  Scenario: Search for Bookshelves
    Given user on the website search for BookShelves
    And close the pop up add
    When user select Bookshelves under category
    And user gives filter price below Rs.15000
    And Select excluding out-of-stock items
    And user sort the results by price from high to low
    Then user should see top 3 bookshelves and print the Names of top 3 bookshhelves in the console output
    And user should see top 3 bookshelves and print the Prices of top 3 bookshhelves in the console output
