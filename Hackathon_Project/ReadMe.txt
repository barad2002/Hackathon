Name - Baradwaj E
Employee ID - 2318452
Role - CSD Trainee
Cohort Code - CSDQEA24QE002

Display Bookshelves
*******************
Problem Statement : Display Bookshelves
***************************************
Display the name, price of
1. Bookshelves below Rs. 15000 
2. Including out of stock
3. Storage type should be open.
3. Take first 3 study chair details with highest recommendation
If more than one item with same price displayed, include that details as well.
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

Detailed Description: Hackath Ideas
***********************************
1. Search for "BookShelves" with price below Rs. 15000, Category any one (like Wall Shelves / Kid Bookshelves / Study Tables, etc) &  exclude out of stock. Sort by price "High to Low", fetch the top 3 items & print all details in console output.
2. From Living, retrieve all items under any one of sub-menu items like  "Seating & Chairs" or "Living Storage". 
Also print the same in console output.
3. Under "Gift cards", choose "Birthday/Anniversay"; Fill "Customize your gift card" with valid price & date and 
click "Next" button; Fill "To" & "From" details under "who is this lucky person" with any one email id invalid 
(example: without @ symbol) and click "Submit"; Capture & display the error message in console output. 
Then give valid email id & validate all the given details in the "Confirm Details" section
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

Key Automation Scope
********************
Handling alert, drag & drop, search option
Extract menu items & store in collections
Navigating back to home page
Scrolling down in web page
Filling form (in different objects in web page)
Capture warning message

***Test Scenarios and Test Cases For the above Requirement are***
---
BookShelves Search	   
Scenario 1 : Search for BookShelves under Rs. 15000 and exclude out of stock items  
1. Open the urbanladder page
2. Search for BookShelves
3. Click search button
4. Check the text as Search Results For Bookshelves is present
5. Apply a filter to show items priced below 15000
6. Apply a filter to exclude out of stock items
7. Select a category from Wall Shelves or Kid Bookshelves or Study Tables 
8. Sort the items by price from High to Low
9. Fetch the top three items
10.Print all details of the top three items in the console output
---
---
For Living Page
Scenario 2 : Retrieving the Living sub menu items
1. Given On the Living page
2. When choose a sub-menu item from Seating & Chairs or Living Storage
3. Then retrieve all items under the chosen sub-menu
4. And print the retrieved items in the console---
---
For GiftCards Page
Scenario 3 :Validating the Gift Cards Page
1. Given Go to the Gift Cards page
2. When Check the giftcard page is opened
3. And Click the Birthday or Anniversary card
4. And Fill Customize your gift card with valid price & date and click Next button
5. And Fill To and From details under who is this lucky person with "<sheetName>" and any one "<rowNum>" email id invalid and click Submit
6. Then Capture the error message
7. And Validate the details in the confirm details section
----
Utility Classes
***************
1. DataReader.java    - For retrieving data from Excel sheet to the WebPage


Technologies Used
*****************
1. Java Programming Language
2. Selenium Automation Tool
3. Cucumber Framework
4. Apache Log4j
5. Apache POI
6. AventStack
7. JUnit
