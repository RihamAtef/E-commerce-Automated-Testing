@smoke
  Feature: checkout-this feature is created to check out your shopping cart


  Scenario:
    Given The guest user add product to the shopping cart page
     When click on shopping cart icon
     And  user agrees to the terms and conditions and clicks on the Check out button
     Then The user clicks on check out as a guest button
     And  User enter first"name" and last "name"
     And  User enter email "email"and company"company"
     And  User select country and select state
     And  User write city"cairo" Address"One" and Address"Two" and zip "zip2"
     And The user adds ,"<Phone number>" and fax
    And The user clicks on Continue
    And The user selects the shipping method and clicks on Continue
    And  User selects check money order method and clicks on Continue
    And  user adds the payment method details and clicks on Continue
    And  user clicks on Continue in payment information
    And  The guest user clicks on Confirm
    Then The order for the Guest is confirmed and the user can navigate

   Scenario:
    Given The guest user add product to the shopping cart page
    When click on shopping cart icon
    And  user agrees to the terms and conditions and clicks on the Check out button
    Then The user clicks on check out as a guest button
    And  User enter first"name" and last "name"
    And  User enter email "email"and company"company"
    And  User select country and select state
    And  User write city"cairo" Address"One" and Address"Two" and zip "zip2"
    And The user adds ,"<Phone number>" and fax
    And The user clicks on Continue
    And The user selects the shipping method and clicks on Continue
    And  User selects check Credit card method and clicks on Continue
    And  user adds the payment method details "cardHolderName",cardNumber,Expiration date,cardCode and clicks on Continue and clicks on Continue
    And The guest user clicks on Confirm
    Then The order for the Guest is confirmed and the user can navigate






