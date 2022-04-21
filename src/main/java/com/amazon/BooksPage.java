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


    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[8]/span")
    public WebElement bestBooksOfTheMonth;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/Amazon.comBooks?rw_useCurrentProtocol=1&ref_=amb_link_ojtSVy9qS5SJ5N1KElWmyg_16']")
    public WebElement onFaceBookLink;

//    @FindBy(xpath = "//*[@id=\"u_0_k_w/\"]/div/div[1]/button")
//    public WebElement createNewAccountButton;
//
//    @FindBy(xpath = "//a[@href='/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUwNTI1MTI4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D']")
//    public WebElement alreadyHaveAnAccountButton;

//    @FindBy(id = "email")
//    public WebElement emailInputField;
//
//    @FindBy(id = "pass")
//    public WebElement passInputField;
//
//    @FindBy(id = "loginbutton")
//    public WebElement loginButton;


    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

  }




