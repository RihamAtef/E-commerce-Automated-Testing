package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class homePage {

    public  homePage() {

        PageFactory.initElements(driver, this);

    }


    @FindBy(css="img[alt=\"Picture of Apple MacBook Pro 13-inch\"]")
    public WebElement product;

}



