package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testFurnitureSection() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furnitureButton.click();
        amazonHomePage.shopAllLivingRoomFurnitureButton.click();
        amazonHomePage.wallArtButton.click();
        amazonHomePage.realismStyleButton.click();


        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com";
        Assert.assertEquals(actualTitle, expectedTitle, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }

    @Test
    public void testHoverOnAmazonHomeSubnav() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);

        actions.moveToElement(amazonHomePage.shopByStyleHover);
        actions.moveToElement(amazonHomePage.homeStyleQuizButton);
        actions.click().build().perform();


    }



}
