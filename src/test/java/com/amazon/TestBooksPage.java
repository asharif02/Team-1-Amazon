package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestBooksPage extends TestBasePage {


@Test
    public void testChildrensBooksButton(){
    Homepage homepage = new Homepage();
    BooksPage booksPage = homepage.navigateToBooksPage();
    booksPage.childrensBooksButton.click();
    booksPage.ageThreeToFiveLink.click();
}

}
