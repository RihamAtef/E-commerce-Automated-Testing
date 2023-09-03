package org.example.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.Hooks.driver;

public class confirmlist
{
    public confirmlist()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong" )
    public WebElement confirmMsg;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
    public WebElement orderDetails;
}
