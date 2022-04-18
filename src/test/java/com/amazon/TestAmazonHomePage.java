package com.amazon;

import base.TestBasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testFurnitureSectionItemRetrieval() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furnitureButton.click();
        amazonHomePage.shopAllLivingRoomFurnitureButton.click();
        amazonHomePage.wallArtButton.click();
        amazonHomePage.realismStyleButton.click();


//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Shop by Room - Living Room | Amazon.com";
//        Assert.assertEquals("ACTUAL DOES NOT MATCH EXPECTED RESULT", actualTitle, expectedTitle);
    }

//    @Test
//    public void testFurnitureButton() {
//        Homepage homepage = new Homepage();
//        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
//        amazonHomePage.furnitureButton.click();
//    }

//    @Test
//    public void testShopAllLivingRoomFurnitureButton() {
//        Homepage homepage = new Homepage();
//        AmazonHomePage amazonHomePage = new AmazonHomePage();
//        amazonHomePage.furnitureButton.click();
//        amazonHomePage.shopAllLivingRoomFurnitureButton.click();
//    }


}
