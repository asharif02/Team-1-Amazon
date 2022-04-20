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


    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[6]")
    public WebElement textBooksButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=5&ref_=amb_link_VJgLpYAkM7akdE0i3DIT6A_10']")
    public WebElement computersAndTechnologyLink;


    @FindBy(xpath = "//a[@href='/rentals/b/?ie=UTF8&node=17853655011&ref_=sv_b_6']")
    public WebElement textBookRentalsButton;

    @FindBy(xpath = "//*[@id=\"isbn-search\"]")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id='isbn-search-submit']")
    public WebElement GoButton;

    public void typeOnSearchBar(String input) {
        searchBar.sendKeys(input);
    }


    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

  }




