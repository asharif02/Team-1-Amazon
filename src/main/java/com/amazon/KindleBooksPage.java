package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class KindleBooksPage extends BasePage {
    private static final String URL = "https://www.amazon.com";



//Test Case 1
    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
    public WebElement kindleUnlimitedCheckbox;

//Test Case 2
    @FindBy(xpath = "//a[@href='/Amazon-Kindle-Ereader-Family/b/?ie=UTF8&node=6669702011&ref_=topnav_storetab_kstore']")
    public  WebElement buyAKindleTab;

//Test Case 3
    @FindBy (xpath = "//a[@href='/b/?ie=UTF8&node=11552285011&ref_=sv_kstore_6']")
    public  WebElement kindleBookDealsTab;

//Test Case 4
    @FindBy (xpath = "//*[text()='Prime Reading Eligible']")
    public WebElement primeReadingCheckbox;

//Test Case 5
    @FindBy (xpath = "//img[@alt='Riley Thorn and the Blast from the Past']")
    public WebElement rileyThornBook;

//Test Case 6
    @FindBy(xpath = "//a[@href='/b/?ie=UTF8&node=14413390011&ref_=sv_kstore_4']")
    public  WebElement bestSellersAndMoreTab;



    public KindleBooksPage() {

        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }


}



