package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class ProductCartPage {
    public ProductCartPage(){
        PageFactory.initElements(driver,this);
    }

//    @FindBy(id="add-to-cart-button-18")
//    public WebElement addToCartButton;

    @FindBy(id="add-to-cart-button-4")
    public WebElement addToCartButton;

    @FindBy(className="cart-label")
    public WebElement cartIcon;
    @FindBy(css="li[id=\"topcartlink\"]")
    public WebElement shoppingIcon;

}


