package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class KindleBooksPage extends BasePage {
    private static final String URL = "https://www.amazon.com";




    //@FindBy(xpath = "(//a[@class='a-button a-button-image a-carousel-button a-carousel-goto-nextpage'])[2]")
    public WebElement featuredAmazonOriginalBooks;


    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
    public WebElement kindleUnlimitedCheckbox;

    @FindBy(xpath = "//a[@href='/Amazon-Kindle-Ereader-Family/b/?ie=UTF8&node=6669702011&ref_=topnav_storetab_kstore']")
    public  WebElement buyAKindleTab;

    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=11552285011&ref_=sv_kstore_6']")
    public  WebElement kindleBookDealsTab;

    @FindBy (xpath = "//*[text()='Prime Reading Eligible']")
    public WebElement primeReadingCheckbox;

    @FindBy (xpath = "//img[@alt='Riley Thorn and the Blast from the Past']")
    public WebElement rileyThornBook;


    public KindleBooksPage() {

        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }

}



