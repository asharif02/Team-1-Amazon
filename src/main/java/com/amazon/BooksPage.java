package com.amazon;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class BooksPage extends BasePage {

    public static final String url = "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books";

    //TC-001
    @FindBy(xpath = "//a[@href='/Childrens-Books/b/?ie=UTF8&node=4&ref_=sv_b_4']")
    public WebElement childrensBooksButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=2578999011&ref_=chp_manbrowse_age3']")
    public WebElement ageThreeToFiveLink;

    //TC-002
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[6]")
    public WebElement textBooksButton;

    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=5&ref_=amb_link_VJgLpYAkM7akdE0i3DIT6A_10']")
    public WebElement computersAndTechnologyLink;

    //TC-003
    @FindBy(xpath = "//a[@href='/rentals/b/?ie=UTF8&node=17853655011&ref_=sv_b_6']")
    public WebElement textBookRentalsButton;

    @FindBy(xpath = "//*[@id=\"isbn-search\"]")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id='isbn-search-submit']")
    public WebElement GoButton;

    public void typeOnSearchBar(String input) {
        searchBar.sendKeys(input);
    }

    //TC-004
    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=465600&ref_=bhp_brws_txt_stor']")
    public WebElement textBooksStoreLink;

    @FindBy(xpath = "//*[@id=\"sobe_d_b_5_3\"]/a/div/img")
    public WebElement computersAndInternetButton;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[1]/ul/li[4]/span/a/span")
    public WebElement algorithmsLink;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/a/span")
    public WebElement seeMoreLink;

    @FindBy(xpath = "//*[@id=\"p13n-asin-index-1\"]/div[2]/div/a[2]/span/div")
    public WebElement introductionToAlgorithmsLink;

    //TC-005
    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[8]/span")
    public WebElement bestBooksOfTheMonth;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/Amazon.comBooks?rw_useCurrentProtocol=1&ref_=amb_link_ojtSVy9qS5SJ5N1KElWmyg_16']")
    public WebElement onFaceBookLink;

    @FindBy(xpath = "(//a[@role='button'])[3]")
    public WebElement createNewAccountButton;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInputField;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='reg_email__']")
    public WebElement emailInputField;

    //TC-006
    @FindBy(xpath = "//a[@href='/gp/browse.html?rw_useCurrentProtocol=1&node=45&ref_=bhp_brws_dibs']")
    public WebElement dealsInBooksLink;

    @FindBy(xpath = "//*[@src='https://m.media-amazon.com/images/I/41zDsn3OXIS.jpg']")
    public WebElement focusBookLink;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);

    }

  }




