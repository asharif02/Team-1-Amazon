package com.amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='/home-garden-kitchen-furniture-bedding/b/?ie=UTF8&node=1055398&ref_=nav_cs_home']")
    public WebElement amazonHomePage;

    @FindBy(xpath = "//a[@href='/automotive-auto-truck-replacements-parts/b/?ie=UTF8&node=15684181&ref_=nav_cs_automotive']")
    public WebElement automotivePage;

    @FindBy(xpath = "//a[@href='/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books']")
    public WebElement booksPage;

    @FindBy(xpath = "//a[@href='/amazon-fashion/b/?ie=UTF8&node=7141123011&ref_=nav_cs_fashion']")
    public WebElement fashionPage;

    @FindBy(xpath = "//a[@href='/Kindle-eBooks/b/?ie=UTF8&node=154606011&ref_=nav_cs_kindle_books']")
    public WebElement kindleBooksPage;

    @FindBy(xpath = "//a[@href='/music/unlimited?ref_=nav_cs_music']")
    public WebElement musicPage;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry']")
    public WebElement registryPage;



    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public AmazonHomePage navigateToAmazonHomePage() {
        clickOnElement(amazonHomePage);
        return new AmazonHomePage();
    }

    public AutomotivePage navigateToAutomotivePage() {
        clickOnElement(automotivePage);
        return new AutomotivePage();
    }

    public BooksPage navigateToBooksPage() {
        clickOnElement(booksPage);
        return new BooksPage();
    }

    public FashionPage navigateToFashionPage() {
        clickOnElement(fashionPage);
        return new FashionPage();
    }

    public KindleBooksPage navigateToKindleBooksPage() {
        clickOnElement(kindleBooksPage);
        return new KindleBooksPage();
    }

    public MusicPage navigateToMusicPage() {
        clickOnElement(musicPage);
        return new MusicPage();
    }

    public RegistryPage navigateToRegistryPage() {
        clickOnElement(registryPage);
        return new RegistryPage();
    }

}
