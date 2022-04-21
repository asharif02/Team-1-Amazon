package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TestAmazonHomePage extends TestBasePage {

    // region 1st test case
    @Test
    public void testViewWallArtItemListings() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();

        // Navigation
        amazonHomePage.furnitureButton.click();
        amazonHomePage.shopAllLivingRoomFurnitureButton.click();
        amazonHomePage.wallArtButton.click();
        amazonHomePage.realismStyleButton.click();

        // Assertion
        String actualText = driver.findElement(By.xpath("(//*[text()='Wall Art'])[3]")).getText();
        String expectedText = "Wall Art";
        System.out.println("Enjoy Shopping for Realism " + actualText);
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 2nd test case
    @Test
    public void testFilterTVItemListings() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();

        // Navigation
        amazonHomePage.electronicsButton.click();
        amazonHomePage.tvVideoIcon.click();
        amazonHomePage.twentyTwentyOneCheckbox.click();

        // Filter Results
        amazonHomePage.lowPriceTextField.sendKeys("750");
        amazonHomePage.highPriceTextField.sendKeys(("1500"));
        amazonHomePage.goSearchButton.click();

        // Assertion
        WebElement highPriceValue = driver.findElement(By.xpath("//li[@id='p_36/price-range']//input[@value='1,500']"));
        String actualText = highPriceValue.getAttribute("value");
        String expectedText = "1,500";
        System.out.println("Currently viewing 2021 TVs that cost no more than $" + actualText + " dollars.");
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 3rd test case (modify assertion for survey feedback)
    @Test
    public void testFillOutSendFeedbackSurvey() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);

        // Navigation
        actions.moveToElement(amazonHomePage.discoverHyperlinkHover).build().perform();
        actions.moveToElement(amazonHomePage.discoverPanel).click().build().perform();

        amazonHomePage.startLikingNowButton.click();

        // SO MUCH CLICKING LOL MY BAD
        amazonHomePage.dislikeButtonOne.click();
        amazonHomePage.likeButtonOne.click();
        amazonHomePage.likeButtonTwo.click();
        amazonHomePage.likeButtonThree.click();
        amazonHomePage.dislikeButtonTwo.click();
        amazonHomePage.dislikeButtonThree.click();
        amazonHomePage.likeButtonFour.click();
        amazonHomePage.likeButtonFive.click();
        amazonHomePage.likeButtonSix.click();
        amazonHomePage.exploreMoreCoffeeTablesPanel.click();

        // Feedback Survey

        // Assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Discover your style - Coffee Tables | Amazon.com";
        Assert.assertEquals(actualTitle, expectedTitle, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 4th test case
    @Test
    public void testHammockAddToCart() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);

        // Navigation
        actions.moveToElement(amazonHomePage.gardenOutdoorHyperlinkHover).build().perform();
        actions.moveToElement(amazonHomePage.hammocksHyperLink).click().build().perform();

        amazonHomePage.hammockItemListing.click();
        amazonHomePage.hammockAddToCartButton.click();
        amazonHomePage.noThanksToWarrantyCoverageButton.click();

        // Assertion
        String actualText = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText().toLowerCase();
        String expectedText = "Added to Cart".toLowerCase();
        System.out.println("Hammock was successfully " + actualText + "!");
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 5th test case
    @Test
    public void testDesignVirtualRoom() throws InterruptedException {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);
//        ArrayList tabs = new ArrayList(driver.getWindowHandles());

        // Navigation
        actions.moveToElement(amazonHomePage.shopByRoomHoverMenu).build().perform();
        actions.moveToElement((amazonHomePage.seeMoreRoomPanel)).click().build().perform();

        amazonHomePage.visitShowroomButton.click();
        amazonHomePage.roomStyleDropdownBar.click();
        amazonHomePage.rightCarouselButton.click();
        amazonHomePage.modernRoomStyleImage.click();
        Thread.sleep(1500);
        amazonHomePage.viewProductsButton.click();
        amazonHomePage.chandelierTab.click();
        amazonHomePage.firstChandelierItem.click();

        // Product will open in new tab, I need to switch to it
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        Thread.sleep(5000); // only put this because I wanted to actually see it switch tabs lol

        // Getting the title of all opened tabs
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();

        while(it.hasNext()) {
            driver.switchTo().window(it.next());
//            System.out.println(driver.getTitle());
        }

        // Assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Chandeliers,6-Lights Sputnik Chandeliers Brushed Nickel Vintage Pendant Lighting Mid CentuModern Kitchen Dining Room Living Room Bedroom Ceiling Light Fixture - - Amazon.com";
        Assert.assertEquals(actualTitle, expectedTitle, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

}
