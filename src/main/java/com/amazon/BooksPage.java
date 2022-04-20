package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksPage extends BasePage {

    public static final String url = "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books";

    @FindBy(xpath = "//a[@href='/Childrens-Books/b/?ie=UTF8&node=4&ref_=sv_b_4']")
    public WebElement childrensBooksButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=2578999011&ref_=chp_manbrowse_age3']")
    public WebElement ageThreeToFiveLink;


    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

  }




