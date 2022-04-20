package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;

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
    public void testTextBooksRentalButton(){
        Homepage homepage = new Homepage();
        String searchTerm = "Quran";
        BooksPage booksPage = homepage.navigateToBooksPage();
        booksPage.textBookRentalsButton.click();
        booksPage.searchBar.click();
        booksPage.GoButton.sendKeys(searchTerm);
    }
}