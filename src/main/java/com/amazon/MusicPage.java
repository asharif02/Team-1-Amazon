package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MusicPage extends BasePage {

    // Set and start at amazon url
    public static final String URl = "https://www.amazon.com";

    // Test Case 1, Navigate to Music page
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[8]")
    public WebElement MusicTab;

    // Test Case 2, Try it free button, its a two step process, fixed your xpath !
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[8]")
    public WebElement MusicTab2;
    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    public WebElement TryItFreeButton;


    // Test Case 3, Open web player
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[9]")
    public WebElement OpenWebPlayer;

    public MusicPage () {
        webDriverWait.until(ExpectedConditions.urlContains(URl));
        PageFactory.initElements(driver,this);
    }

}
