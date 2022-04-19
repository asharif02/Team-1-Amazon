package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "(//img[@class='gr-card__img'])[3]")
    public WebElement birthdayGiftListButton;

    public RegistryPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }
}
