package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MusicPage extends BasePage {

    // Set and start at amazon url
    public static final String url = "https://www.amazon.com";

    // Test Case 1, Navigate to Music page
    @FindBy(xpath = "//div[@class='nav-a ']")
    public WebElement MusicTab;

}
