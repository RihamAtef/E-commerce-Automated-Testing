package org.example.stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepdefs.Hooks.driver;

public class Checkout {
    Faker faker = new Faker();
    checkoutAsGuest guest = new checkoutAsGuest();
    homePage home = new homePage();
    ProductCartPage product = new ProductCartPage();
    cartPage cart = new cartPage();
    CheckoutPage checkout = new CheckoutPage();

    @Given("The guest user add product to the shopping cart page")
    public void userAddProductToShoppingCart() {
        //User select and opens the product
        home.product.click();
        //User click on add to the cart button that on the product page
        product.addToCartButton.click();
    }

    @When("click on shopping cart icon")
    public void ClickOnShoppingCartIcon() {
        product.shoppingIcon.click();
    }

    @And("user agrees to the terms and conditions and clicks on the Check out button")
    public void UserAgreesToTheTermsAndConditionsAndClicksOnTheCheckOutButton() {
        cart.checkbox.click();
        cart.checkout.click();
    }

    @Then("The user clicks on check out as a guest button")
    public void theUserClicksOnCheckOutAsAGuestButton() {
        guest.GuestCheckout.click();

    }

    @And("User enter first{string} and last {string}")
    public void enterFirstAndLast(String arg0, String arg1) {
        arg0 = faker.name().firstName();
        checkout.firstname.sendKeys(arg0);
        arg1 = faker.name().lastName();
        checkout.lastname.sendKeys(arg1);

    }

    @And("User enter email {string}and company{string}")
    public void enterEmailAndCompany(String arg0, String arg1) {
        arg0 = faker.internet().emailAddress();
        checkout.email.sendKeys(arg0);
        arg1 = faker.company().name();
        checkout.company.sendKeys(arg1);
    }

    @And("User select country and select state")
    public void selectCountryAndSelectState() {
        Select select = new Select(checkout.country);
        select.selectByValue("4");
    }

    @And("User write city{string} Address{string} and Address{string} and zip {string}")
    public void writeCityAddressAndAddressAndZip(String arg0, String arg1, String arg2, String arg3) {
        arg0 = faker.address().fullAddress();
        arg1 = faker.address().fullAddress();
        arg2 = faker.address().zipCode();
        arg3 = faker.address().city();
        checkout.address1.sendKeys(arg0);
        checkout.address2.sendKeys(arg1);
        checkout.zip.sendKeys(arg2);
        checkout.city.sendKeys(arg3);

    }

    @And("The user adds ,{string} and fax")
    public void theUserAddsAndFax(String arg0) {
        arg0 = faker.phoneNumber().phoneNumber();
        checkout.phoneNumber.sendKeys(arg0);
        checkout.faxNumber.sendKeys("001144");
    }

    @And("The user clicks on Continue")
    public void theUserClicksOnContinue() {
        checkout.continueBtn_billingAddress.click();
    }

    @And("The user selects the shipping method and clicks on Continue")
    public void theUserSelectsTheShippingMethodAndClicksOnContinue() {
        boolean statues = checkout.shippingMethodGround.isSelected();
        if (statues == false) {
            checkout.shippingMethodGround.click();
        }
        checkout.continueBtn_ShippingMethod.click();
    }


    @And("User selects check money order method and clicks on Continue")
    public void userSelectsCheckMoneyOrderMethodAndClicksOnContinue() {
        boolean status = checkout.checkMoneyOrder.isSelected();
        if (status==false) {
            checkout.checkMoneyOrder.click();
        }
            checkout.continueBtn_paymentMethod.click();

    }

    @And("user adds the payment method details and clicks on Continue")
    public void userAddsThePaymentMethodDetailsAndClicksOnContinue()
    { checkout.continueBtn_paymentMethod.click();
    }

    @And("user clicks on Continue in payment information")
    public void userClicksOnContinueInPaymentInformation() {
        checkout.continueBtn_PaymentInfo.click();

    }


    @And("The guest user clicks on Confirm")
    public void theGuestUserClicksOnConfirm() {
        checkout.confirmBtn.click();

    }
    SoftAssert soft= new SoftAssert();
    confirmlist completedPage= new confirmlist();

    @Then("The order for the Guest is confirmed and the user can navigate")
    public void theOrderForTheGuestIsConfirmedAndTheUserCanNavigate() {
        String expectedMsg="Your order has been successfully processed!";
            String actualMsg =completedPage.confirmMsg.getText();

            boolean result=actualMsg.contains(expectedMsg);
            soft.assertTrue(result);
            completedPage.orderDetails.click();

        }

    @And("User selects check Credit card method and clicks on Continue")
    public void userSelectsCheckCreditCardMethodAndClicksOnContinue()
    {
        boolean status = checkout.checkCreditCard.isSelected();
        if (status==false) {
            checkout.checkCreditCard.click();
        }
        checkout.continueBtn_paymentMethod.click();



    }

    @And("user adds the payment method details {string},cardNumber,Expiration date,cardCode and clicks on Continue and clicks on Continue")
    public void userAddsThePaymentMethodDetailsCardNumberExpirationDateCardCodeAndClicksOnContinueAndClicksOnContinue(String arg0) {

            Select selectCredit= new Select(checkout.cardType);
            selectCredit.selectByValue("MasterCard");
            arg0=faker.name().fullName();
            checkout.holderName.sendKeys(arg0);
            checkout.cardNumber.sendKeys("5555555555554444");
            Select selectMonth= new Select(checkout.month);
            selectMonth.selectByValue("2");
            Select selectYear= new Select(checkout.year);
            selectYear.selectByValue("2025");
            checkout.cardCode.sendKeys("907");
            checkout.continueBtn_PaymentInfoCreditCard.click();

    }
}







