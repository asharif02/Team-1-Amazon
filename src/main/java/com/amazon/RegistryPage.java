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


    @FindBy(xpath = "//span[@class='a-button a-button-dropdown gr-find-stripe__type']")
    public WebElement serachingBarDropDownIcon;

    @FindBy(xpath = "//li[@aria-labelledby='dropdown1_2']")
    public WebElement birthdayGiftListDropDownOption;

    @FindBy(xpath = "(//span[@class=\"gr-subnav__item-text\"])[6]")
    public WebElement helpButton;


    public RegistryPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }




}
