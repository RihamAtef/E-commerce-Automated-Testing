package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class checkoutAsGuest {
    public checkoutAsGuest()
    {
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")

    public WebElement GuestCheckout ;
}
