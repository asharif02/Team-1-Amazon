package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonHomePage extends BasePage {

    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "//img[@alt='Furniture']")
    public WebElement furnitureButton;

    @FindBy(xpath = "//img[@alt='Shop all Living Room Furniture']")
    public WebElement shopAllLivingRoomFurnitureButton;

    @FindBy(xpath = "//img[@alt='Wall art']")
    public WebElement wallArtButton;

    @FindBy(xpath = "//a[@aria-label='Realism']")
    public WebElement realismStyleButton;

    public AmazonHomePage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }


}
