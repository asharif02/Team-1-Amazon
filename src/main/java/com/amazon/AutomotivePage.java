package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URL;


public class AutomotivePage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    //TestCase1- Navigating to automotive button and testing the Car Care button functionality
    @FindBy(xpath = "//a[@title='Car Care']")
    public WebElement carCareButton;

    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton;

    //testCase2-  Testing the Oil & Fluids Button functionality
    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption2;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton2;

    @FindBy(xpath = "//a[@title='Oils & Fluids']")
    public WebElement oilnFluidsButton;

    //testCase3- Functionality of Fluid pump item button in Oil & Fluids category
    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption3;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton3;

    @FindBy(xpath = "//a[@title='Oils & Fluids']")
    public WebElement oilnFluidsButton3;

    @FindBy(xpath = "//*[@class='a-size-base-plus a-color-base a-text-normal']")
    public  WebElement oilnFluidPumpItem;

    //testCase4- testing the functionality of fluidPump video button
    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    public WebElement automotiveScrollOption4;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement searchSubmitButton4;

    @FindBy(xpath = "//a[@title='Oils & Fluids']")
    public WebElement oilnFluidsButton4;

    @FindBy(xpath = "//*[@class='a-size-base-plus a-color-base a-text-normal']")
    public  WebElement oilnFluidPumpItem4;

    @FindBy(xpath = "//*[@id='a-autoid-15']")
    public WebElement fluidPumpVideo;

    //testcase5




    public AutomotivePage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver,this);
    }
}
