package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestKindleBooksPage extends TestBasePage {

    @Test
    public void testFeaturedAmazonOriginalBooks(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.featuredAmazonOriginalBooks.click();



    }

    @Test
    public  void  testKindleUnlimitedCheckbox(){
    Homepage homepage = new Homepage();
    KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
    kindleBooksPage.kindleUnlimitedCheckbox.click();


}

    @Test
    public void  testBuyAKindleTab(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.buyAKindleTab.click();


    }

    @Test
    public void testKindleBookDealsTab() throws InterruptedException {
    Homepage homepage = new Homepage();
    KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
    kindleBooksPage.kindleBookDealsTab.click();


}



}
