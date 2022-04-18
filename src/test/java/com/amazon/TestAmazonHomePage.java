package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testFurnitureButton() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furnitureButton.click();
    }


}


