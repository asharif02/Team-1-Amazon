package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestBooksPage extends TestBasePage {

    @Test
    public void testChildrensBookNavigation() {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();

        booksPage.childrensBooksButton.click();

    }
}
