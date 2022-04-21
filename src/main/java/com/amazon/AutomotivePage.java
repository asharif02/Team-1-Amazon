package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URL;

//testcase1
public class AutomotivePage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "//a[@title='Car Care']")
    public WebElement carCareButton;

    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton;

    //testCase2
    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption2;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton2;

    @FindBy(xpath = "//a[@title='Oils & Fluids']")
    public WebElement oilnFluidsButton;

    //testCase3
    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption3;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton3;

    @FindBy(xpath = "//a[@title='Oils & Fluids']")
    public WebElement oilnFluidsButton3;

    @FindBy(xpath = "//*[@class='a-size-base-plus a-color-base a-text-normal']")
    public  WebElement oilnFluidPumpItem;



    public AutomotivePage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver,this);
    }
}
