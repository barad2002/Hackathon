Feature: Gift Cards

  @smoke @regression
  Scenario Outline: Validating the Gift Cards Page
    Given Go to the Gift Cards page
    When Check the giftcard page is opened
    And Click the Birthday or Anniversary card
    And Fill Customize your gift card with valid price & date and click Next button
    And Fill To and From details under who is this lucky person with "<sheetName>" and any one "<rowNum>" email id invalid and click Submit
    Then Capture the error message
    And Validate the details in the confirm details section

    Examples: 
      | sheetName | rowNum |
      | GetData   |      0 |
      | GetData   |      1 |
      | GetData   |      2 |
      | GetData   |      3 |
      | GetData   |      4 |
      | GetData   |      5 |
      | GetData   |      6 |
      | GetData   |      7 |
      | GetData   |      8 |
      | GetData   |      9 |
      | GetData   |     10 |
      | GetData   |     11 |
      | GetData   |     12 |
      | GetData   |     13 |
      | GetData   |     14 |
      | GetData   |     15 |
      | GetData   |     16 |
      | GetData   |     17 |
      | GetData   |     18 |
      | GetData   |     19 |
      #| GetData   |     20 |
