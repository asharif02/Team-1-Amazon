package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;

public class TestBooksPage extends TestBasePage {


    @Test
    public void testChildrensBooksButton() {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.childrensBooksButton.click();
        booksPage.ageThreeToFiveLink.click();
    }

    @Test
    public void testTextBooksButton() {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.textBooksButton.click();
        booksPage.computersAndTechnologyLink.click();
    }

    @Test
    public void testTextBooksRentalButton() {
        Homepage homepage = new Homepage();
        String searchTerm = "Quran";
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.textBookRentalsButton.click();
        booksPage.searchBar.click();
        booksPage.GoButton.sendKeys(searchTerm);
    }

    @Test
    public void testTextBooksStoreLink() {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.textBooksStoreLink.click();
        booksPage.computersAndInternetButton.click();
        booksPage.algorithmsLink.click();
        booksPage.seeMoreLink.click();
        booksPage.introductionToAlgorithmsLink.click();
    }

    @Test
    public void testBestBooksOfTheMonth() throws InterruptedException {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.bestBooksOfTheMonth.click();
        booksPage.onFaceBookLink.click();
        Thread.sleep(2000);
        booksPage.createNewAccountButton.click();
        booksPage.firstNameInputField.sendKeys("zohra");
        booksPage.lastNameInputField.sendKeys("lamrani");
        booksPage.emailInputField.sendKeys("tadefi_01@yahoo.fr");
   }
}