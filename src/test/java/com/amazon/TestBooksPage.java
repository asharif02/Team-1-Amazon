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






//    @Test
//    public void testChildrensBooksButton(){
//
//        BooksPage bookspage = new Bookspage();
//        ChildrensBooks childrensbooks = BooksPage.navigateToChildrensBooks;
//        BooksPage.childrensBooksButton.click();
//    }
//    @Test
//    public void testBestKidsBooksButton(){ //test case failed
//        Homepage homepage = new Homepage();
//        BooksPage booksPage = homepage.navigateToBooksPage();
//        BooksPage.bestKidsBooksButton.click();
//    }
//    public void testBe//*[@id="nav-subnav"]/a[5]/spanstKidsBooksButton(){ //test case failed
//        Homepage homepage = new Homepage();
//        BooksPage booksPage = homepage.navigateToBooksPage();
//        //BooksPage.childrensBooks.click();
    //}

}
