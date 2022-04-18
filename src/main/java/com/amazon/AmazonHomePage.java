package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonHomePage extends BasePage {

    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "//img[@alt='Décor']")
    public WebElement furnitureButton;

    public AmazonHomePage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }


}
