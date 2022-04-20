package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksPage extends BasePage {

    private static final String url = "https://www.amazon.com";

    @FindBy(xpath = "(//a[@data-nav-link-color='#e47911'])[5]")
    public WebElement childrensBooksButton;

    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

}
