package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class cartPage {

    public cartPage(){
        PageFactory.initElements(driver,this);
    }
//    @FindBy(className="button-1 checkout-button")
//    public WebElement checkOutBtn;

    @FindBy(className="qty-input")
    public WebElement qtyInput;


    @FindBy(id="termsofservice")
    public WebElement checkbox;
    @FindBy(css="button[value=\"checkout\"]")
    public WebElement checkout;

}
