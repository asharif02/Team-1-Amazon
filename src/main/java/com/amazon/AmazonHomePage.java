package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonHomePage extends BasePage {

    private static final String URL = "https://www.amazon.com";

    // region Test Case 1 Web Elements
    @FindBy(xpath = "//img[@alt='Furniture']")
    public WebElement furnitureButton;

    @FindBy(xpath = "//img[@alt='Shop all Living Room Furniture']")
    public WebElement shopAllLivingRoomFurnitureButton;

    @FindBy(xpath = "//img[@alt='Wall art']")
    public WebElement wallArtButton;

    @FindBy(xpath = "//a[@aria-label='Realism']")
    public WebElement realismStyleButton;
    // endregion

    // region Test Case 2 Web Elements
    @FindBy(xpath = "//img[@alt='Electronics']")
    public WebElement electronicsButton;

    @FindBy(xpath = "//img[@alt='TV & Video']")
    public WebElement tvVideoIcon;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]//li[1]//label/i")
    public WebElement twentyTwentyOneCheckbox;

    @FindBy(xpath = "//input[@id='low-price']")
    public WebElement lowPriceTextField;

    @FindBy(xpath = "//input[@id='high-price']")
    public WebElement highPriceTextField;

    @FindBy(xpath = "//span[@class='a-button-inner']//input[@type='submit']")
    public WebElement goSearchButton;
    // endregion

    // region Part 3
    @FindBy(xpath = "//a[@href='/b/?ie=UTF8&node=17853230011&ref_=sv_hg_3']")
    public WebElement shopByStyleHover;

    @FindBy(xpath = "//a[@href='/stylequiz?ref=sq_sbs_mn']")
    public WebElement homeStyleQuizButton;

    @FindBy(xpath = "//a[@href='/discover/?_encoding=UTF8&ref_=sv_hg_2']")
    public WebElement discoverHyperlinkHover;

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/G/01/img18/home/discoveryourstyle/discover_your_style_mega_sub_nav.jpg']")
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

    @FindBy(xpath = "//a[@href='i/home/#furniture']")
    public WebElement seeAllFurnitureButton;

    @FindBy(xpath = "(//a[@class='teaser-category-page-link mirai-clickable'])[1]")
    public WebElement exploreMoreCoffeeTablesPanel;

    @FindBy(xpath = "//a[@href='/forms/7243890f-4319-4c8a-9009-4225a207a89d']")
    public WebElement sendFeedbackButton;

    @FindBy(xpath = "//input[@value='0f636346-1cf6-424c-9ac7-80adb5fffe52']")
    public WebElement extremelyHelpfulRadioButton;

    @FindBy(xpath = "//input[@value='00033599-24c9-43a9-9ebe-b5a598299a47']")
    public WebElement findASpecificProductCheckbox;

    @FindBy(xpath = "//input[@value='e177f6a5-03f3-419e-87dd-73c24f0caf25']")
    public WebElement getInspirationCheckbox;


    // endregion

    // region Test Case 4 Web Elements
    @FindBy(xpath = "(//span[@class='nav-a-content'])[9]")
    public WebElement gardenOutdoorHyperlinkHover;

    @FindBy(linkText = "Hammocks")
    public WebElement hammocksHyperLink;

    @FindBy(xpath = "//div[@data-asin='B096RBBF3H']")
    public WebElement hammockItemListing;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement hammockAddToCartButton;

    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    public WebElement noThanksToWarrantyCoverageButton;
    // endregion

    // region Test Case 5 Web Elements
    @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    public WebElement allDepartmentsDropdownMenu;

    @FindBy(xpath = "//a[@href='/Shop-by-Room/b/?ie=UTF8&node=14544458011&ref_=sv_hg_1']")
    public WebElement shopByRoomHoverMenu;

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/G/01/img17/home/mega-subnav/2-SBR-See-More-2._CB511895964_.jpg']")
    public WebElement seeMoreRoomPanel;

    @FindBy(xpath = "//img[@alt='Discover Rooms. Shop by room style']")
    public WebElement visitShowroomButton;

    @FindBy(xpath = "//button[@id='sbl_filter_roomstyle_button']")
    public WebElement roomStyleDropdownBar;

    @FindBy(xpath = "(//span[@class='a-button-inner scenes-refinements-carousel-button-inner scenes-refinements-carousel-button-inner-right'])[2]")
    public WebElement rightCarouselButton;

    @FindBy(xpath = "//img[@alt='Modern']")
    public WebElement modernRoomStyleImage;

//    @FindBy(xpath = "(//span[@data-view-products='{\"physicalId\":\"81Fll6j-sWL\"}'])[2]")
//    @FindBy(xpath = "//div[@data-physical-id='81Fll6j-sWL']")
    @FindBy(xpath = "(//img[@src='https://m.media-amazon.com/images/I/81Fll6j-sWL._AC_UL750_.jpg'])[1]")
    public WebElement viewProductsButton;

    @FindBy(xpath = "(//div[@data-asin='B08PQBB934'])[1]")
    public WebElement chandelierTab;

    @FindBy(xpath = "(//div[@data-asin='B08PQBB934'])[3]")
    public WebElement firstChandelierItem;
    // endregion


    // region Test Case 6 Web Elements
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonMainSearchBar;

    @FindBy(xpath = "nav-search-submit-button")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "(//img[@data-image-index='5'])[1]")
    public WebElement firstHeatedBlanketResult;

    @FindBy(xpath = "//a[@class='a-link-normal 5star']")
    public WebElement fiveStarReviewLink;


    // endregion


    public AmazonHomePage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }

}
