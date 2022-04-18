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

    @FindBy(xpath = "//a[@href='/b/?ie=UTF8&node=17853230011&ref_=sv_hg_3']")
    public WebElement shopByStyleHover;

    @FindBy(xpath = "//a[@href='/stylequiz?ref=sq_sbs_mn']")
    public WebElement homeStyleQuizButton;

    @FindBy(xpath = "//a[@href='/discover/?_encoding=UTF8&ref_=sv_hg_2']")
    public WebElement discoverHyperlinkHover;

    @FindBy(xpath = "//a[@href='/discover/?ref=sbl_mm_lp']")
    public WebElement discoverPanel;

    @FindBy(xpath = "//a[@class='landing-header-welcome-header-focus mirai-clickable']")
    public WebElement startLikingNowButton;

    @FindBy(xpath = "//div[@data-asin='B09QKQWJGW']//img[@alt='dislike']")
    public WebElement dislikeButtonOne;

    @FindBy(xpath = "//div[@data-asin='B07N8R9WKN']//img[@alt='like']")
    public WebElement likeButtonOne;

    @FindBy(xpath = "//div[@data-asin='B09KLM2J3B']//img[@alt='like']")
    public WebElement likeButtonTwo;

    @FindBy(xpath = "//div[@data-asin='B07DLTBWM3']//img[@alt='like']")
    public WebElement likeButtonThree;

    @FindBy(xpath = "//div[@data-asin='B089GY587K']//img[@alt='dislike']")
    public WebElement dislikeButtonTwo;

    @FindBy(xpath = "//div[@data-asin='B07CJZQ6N4']//img[@alt='dislike']")
    public WebElement dislikeButtonThree;

    @FindBy(xpath = "//div[@data-asin='B08V8Y5HL7']//img[@alt='like']")
    public WebElement likeButtonFour;

    @FindBy(xpath = "//div[@data-asin='B08YS4WSBY']//img[@alt='like']")
    public WebElement likeButtonFive;

    @FindBy(xpath = "//div[@data-asin='B009OBA2V8']//img[@alt='like']")
    public WebElement likeButtonSix;



    public AmazonHomePage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

}
