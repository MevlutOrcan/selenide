@products
Feature: Products

  Scenario: TC08 Verify All Products and product detail page
    And  Navigate to url '/'
    And Keep open browser
    And Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand

@searchingProducts
  Scenario: TC09 Search Product
    And Navigate to url '/'
    And Keep open browser
    And Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify text "Searched Products" is visible
    And Verify all the products related to search are visible