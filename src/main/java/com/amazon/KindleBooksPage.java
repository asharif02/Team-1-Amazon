package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class KindleBooksPage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "myxpath")
    public WebElement bestSellerForwardButton;

    public KindleBooksPage(){

        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver,this);


    }





}



