package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    // region 1st test case
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
    // endregion

    // 2nd test case TBD

    // 3rd test case
    @Test
    public void testHoverOnAmazonHomeSubnav() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);

        // hovering on Discover Hyperlink
        actions.moveToElement(amazonHomePage.discoverHyperlinkHover);
        actions.click().build().perform();

        amazonHomePage.startLikingNowButton.click();

        amazonHomePage.dislikeButtonOne.click();
        amazonHomePage.likeButtonOne.click();
        amazonHomePage.likeButtonTwo.click();
        amazonHomePage.likeButtonThree.click();
        amazonHomePage.dislikeButtonTwo.click();
        amazonHomePage.dislikeButtonThree.click();
        amazonHomePage.likeButtonFour.click();
        amazonHomePage.likeButtonFive.click();
        amazonHomePage.likeButtonSix.click();


    }


    // 4th test case TBD

    // 5th test case TBD


}
