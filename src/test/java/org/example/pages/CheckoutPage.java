package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class CheckoutPage {

    public CheckoutPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy( css = "input[id=\"BillingNewAddress_FirstName\"]")
     public WebElement firstname;
    @FindBy(css="input[id=\"BillingNewAddress_LastName\"]")
    public  WebElement lastname;
    @FindBy (css="input[id=\"BillingNewAddress_Email\"]")
    public  WebElement email;
    @FindBy (css="input[id=\"BillingNewAddress_Company\"]")
    public WebElement company;
    @FindBy(css="select[id=\"BillingNewAddress_CountryId\"]\n")
    public  WebElement country;

    @FindBy(css="input[name=\"BillingNewAddress.Address1\"]")
    public WebElement address1;
    @FindBy(css="input[name=\"BillingNewAddress.Address2\"]")
    public WebElement address2;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    public WebElement phoneNumber;
    @FindBy(id="BillingNewAddress_FaxNumber")
    public WebElement faxNumber;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    public WebElement zip;
    @FindBy(id="BillingNewAddress_City")
    public WebElement city;
    @FindBy(css ="button[onclick=\"Billing.save()\"]")
    public WebElement continueBtn_billingAddress;
    @FindBy(css ="input[value=\"Ground___Shipping.FixedByWeightByTotal\"]")
    public WebElement shippingMethodGround;
    @FindBy(css ="button[onclick=\"ShippingMethod.save()\"")
    public WebElement continueBtn_ShippingMethod;
    @FindBy(id="paymentmethod_0")
    public WebElement checkMoneyOrder;
    @FindBy(id="paymentmethod_1")
    public  WebElement checkCreditCard;
    @FindBy(css ="button[onclick=\"PaymentMethod.save()\"")
    public WebElement continueBtn_paymentMethod;
    @FindBy(css ="button[onclick=\"PaymentInfo.save()\"")
    public WebElement continueBtn_PaymentInfo;
    @FindBy(css ="button[onclick=\"ConfirmOrder.save()\"")
    public WebElement confirmBtn;
    @FindBy(css ="button[onclick=\"PaymentMethod.save()\"")
    public WebElement continueBtn_PaymentMethodCreditCard;
    @FindBy(id="CreditCardType")
    public WebElement cardType;
    @FindBy(id="CardholderName")
    public WebElement holderName;
    @FindBy(id="CardNumber")
    public WebElement cardNumber;
    @FindBy(id="ExpireMonth")
    public WebElement month;
    @FindBy(id="ExpireYear")
    public WebElement year;
    @FindBy(id="CardCode")
    public WebElement cardCode;
    @FindBy(css ="button[onclick=\"PaymentInfo.save()\"")
    public WebElement continueBtn_PaymentInfoCreditCard;

}
