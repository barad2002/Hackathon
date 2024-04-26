Feature: BookShelves Search	
	@smoke @regression
  Scenario: Search for BookShelves under Rs. 15000 and exclude out of stock items
    Given open the urbanladder page
    When search for BookShelves
    And click search button
    And check the text as Search Results For Bookshelves is present
    And apply a filter to show items priced below 15000
    And apply a filter to exclude out of stock items
    And select a category from Wall Shelves or Kid Bookshelves or Study Tables 
    And sort the items by price from High to Low
    Then fetch the top three items
    And print all details of the top three items in the console output
    
    