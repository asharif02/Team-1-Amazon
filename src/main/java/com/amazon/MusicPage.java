package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MusicPage extends BasePage {

    // Set and start at amazon url
    public static final String url = "https://www.amazon.com";

    // Test Case 1, Navigate to Music page
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[8]")
    public WebElement MusicTab;

    // Test Case 2, Try it free button
    @FindBy(xpath = "//*[@id=\"a-autoid-0\"]/span/a")
    public WebElement TryItFreeButton;

    // Test Case 3, Open web player
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[9]")
    public WebElement OpenWebPlayer;


}
