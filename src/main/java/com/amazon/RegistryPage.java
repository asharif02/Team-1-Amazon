package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {
    private static final String URL = "https://www.amazon.com";

//Test case 1
    @FindBy(xpath = "//a[@href='/registries/birthday?ref_=gr-landing']")
    public WebElement KidsBirthdaysButton;


//Test case 2
    @FindBy(xpath = "//span[@class='a-button a-button-dropdown gr-find-stripe__type']")
    public WebElement serachingBarDropDownIcon;

    @FindBy(xpath = "//li[@aria-labelledby='dropdown1_2']")
    public WebElement birthdayGiftListDropDownOption;

//Test case 3
    @FindBy(xpath = "(//span[@class=\"gr-subnav__item-text\"])[6]")
    public WebElement helpButton;

    @FindBy(xpath = "//input[@id='helpsearch']")
    public WebElement findMoreSolutionSearchingBar;

    //Test case 4

    @FindBy(xpath = "//a[@href='/registries/custom?ref_=registries_subnav']")
    public WebElement customGiftListButton;

    @FindBy(xpath = "//a[@class='a-link-normal gr-btn gr-btn--rounded gr-text gr-text--sm gr-hero__cta gr-home-btn theme-custom']")
    public WebElement createAcustomGiftList;


    //Test case 5

    //@FindBy(xpath = "")



    public RegistryPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }




}
