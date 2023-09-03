//package org.example.stepdefs;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//
//import io.cucumber.java.en.When;
//import org.example.pages.ShoppingCartPage;
//import org.example.pages.cartPage;
//import org.example.pages.homePage;
//import org.openqa.selenium.By;
//
//import org.testng.asserts.SoftAssert;
//
//import static org.example.stepdefs.Hooks.driver;
//
//public class AddToCart {
//    homePage home = new homePage();
//    cartPage cart= new cartPage();
//    ShoppingCartPage product = new ShoppingCartPage();
//
//    @Given("User select and opens the product")
//    public void userSelectsAndOpensProduct() {
//        home.product.click();
//    }
//
//    @When("User click on add to the cart button")
//    public void userClickOnAddToTheCartButton() {
//        product.addToCartButton.click();
//    }
//
//
//        @And("User can navigate to the shopping cart to confirm that the product is added")
//        public void userCanNavigateToTheShoppingCartToConfirmThatTheProductIsAdded() {
//            product.cartIcon.click();
//
//            SoftAssert soft =new SoftAssert();
//            boolean actualStatus=driver.findElement(By.cssSelector("button[value=\"checkout\"]")).isDisplayed();
//            soft.assertTrue(actualStatus);
//
//
//            int numOfElements = driver.findElements(By.className("no-data")).size();
//            soft.assertEquals(numOfElements,0);
//
//        }
//
//        @And("User can update the quantity from the shopping cart")
//        public void userCanUpdateTheQuantityFromTheShoppingCart() {
//            cart.qtyInput.clear();
//            cart.qtyInput.sendKeys("2");
//
//    }
//}
//
