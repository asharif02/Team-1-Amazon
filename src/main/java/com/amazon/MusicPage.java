package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MusicPage extends BasePage {

    // Set and start at amazon url
    public static final String URl = "https://www.amazon.com";

    // Copying Xpath is a short way, but it doesn't work for everything
    // Better to learn how to manually write them out

    // TestCase1, Navigate to Music page
    @FindBy(xpath = "//a[@href='/music/unlimited?ref_=nav_cs_music']")
    public WebElement MusicTab;

    // TestCase2, Try it free button, two steps process.
    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    public WebElement TryItFreeButton;


    // TestCase3, Open web player
    @FindBy(xpath = "//a[@href='https://music.amazon.com/?_encoding=UTF8&ref_=sv_dmusic_8']")
    public WebElement OpenWebPlayer;

    // TestCase4, see more The HD Difference
    @FindBy(xpath = "//a[@aria-label='hd and ultra hd']")
    public WebElement SeeMoreHDDifference;

    //TestCase5, Amazon music prime
    //@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
    @FindBy(xpath = "//a[@data-nav-key='aj:https://m.media-amazon.com/images/G/01/MUSIC/CCMP/LandingPages/subnav/subnav_us_en_1.json:subnav-dmusic-flyout-prime:0']")
    public WebElement AmazonMusicPrime;

    // TestCase6, Sign in with Email & Password values (Don't have to, but include wait time)
    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement SignInEmail;
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement SignInPassword;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement SignInSubmit;




    public MusicPage () {
        webDriverWait.until(ExpectedConditions.urlContains(URl));
        PageFactory.initElements(driver,this);
    }

}
