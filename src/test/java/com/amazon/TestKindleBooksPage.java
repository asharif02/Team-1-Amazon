package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestKindleBooksPage extends TestBasePage {

    @Test
    public void testBestSellerForwardButton(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        kindleBooksPage.bestSellerForwardButton.click();



    }




}
