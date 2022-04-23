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

    // test cases start off basic but get more complex :)

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
        String actualText = amazonHomePage.wallArtText.getText();
        String expectedText = "Wall Art";
        System.out.println("Realism " + actualText + " is the best kind of Art!");
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
        String actualText = amazonHomePage.highPriceValue.getAttribute("value");
        String expectedText = "1,500";
        System.out.println("I REFUSE to pay more than $" + actualText + " dollars for a TV!");
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 3rd test case
    @Test
    public void testFillOutSendFeedbackSurvey() throws InterruptedException {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        Actions actions = new Actions(driver);

        // Navigation
        actions.moveToElement(amazonHomePage.discoverHyperlinkHover).build().perform();
        actions.moveToElement(amazonHomePage.discoverPanel).click().build().perform();

        // disregard all this clicking lol
//        amazonHomePage.dislikeButtonOne.click(); amazonHomePage.likeButtonOne.click(); amazonHomePage.likeButtonTwo.click(); amazonHomePage.likeButtonThree.click(); amazonHomePage.dislikeButtonTwo.click(); amazonHomePage.dislikeButtonThree.click(); amazonHomePage.likeButtonFour.click(); amazonHomePage.likeButtonFive.click(); amazonHomePage.likeButtonSix.click(); amazonHomePage.exploreMoreCoffeeTablesPanel.click();

        // Feedback Survey
        amazonHomePage.sendFeedbackButton.click();
        amazonHomePage.extremelyHelpfulRadioButton.click();
        amazonHomePage.findASpecificProductCheckbox.click();
        amazonHomePage.getInspirationCheckbox.click();
        amazonHomePage.findMyStyleCheckbox.click();

        amazonHomePage.textArea1.sendKeys("that this whole entire survey was automated!");
        amazonHomePage.textArea2.sendKeys("by removing this question, one less text area to send keys to lol");
        amazonHomePage.textArea3.sendKeys("nope");
        amazonHomePage.surveySubmitButton.click();
        Thread.sleep(2000);

        // Assertion
        String actualText = amazonHomePage.successfullySubmittedFormText.getText();

        String expectedText = "You have successfully submitted this form.";
        System.out.println("Congrats! " + actualText);
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

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
        String actualText = amazonHomePage.addedToCartConfirmationText.getText();
        String expectedText = "Added to Cart";
        System.out.println("Hammock was successfully " + actualText.toLowerCase() + "!");
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
        Thread.sleep(1500); // I know we're not supposed to use this lol
        amazonHomePage.viewProductsButton.click();
        amazonHomePage.chandelierTab.click();
        amazonHomePage.firstChandelierItem.click();

        // Product will open in new tab, I need to switch to it
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        Thread.sleep(3000); // only put this because I wanted to actually see it switch tabs lol

        // Getting the title of all opened tabs
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();

        while(it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        System.out.println(driver.getTitle()); // confirming that it prints out the title of the LAST tab in the set

        // Assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Chandeliers,6-Lights Sputnik Chandeliers Brushed Nickel Vintage Pendant Lighting Mid CentuModern Kitchen Dining Room Living Room Bedroom Ceiling Light Fixture - - Amazon.com";
        Assert.assertEquals(actualTitle, expectedTitle, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

    // region 6th test case
    @Test
    public void testReadingItemReviews() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();

        // Navigation
        amazonHomePage.amazonMainSearchBar.sendKeys("heated blanket");
        amazonHomePage.amazonMainSearchBar.sendKeys(Keys.ENTER);
        amazonHomePage.firstHeatedBlanketResult.click();
        amazonHomePage.fiveStarReviewLink.click();

        // Assertion
        String actualText = amazonHomePage.fiveStarOnlyText.getText();
        String expectedText = "5 star only";
        System.out.println("I want to read " + actualText + " reviews!");
        Assert.assertEquals(actualText, expectedText, "ACTUAL DOES NOT MATCH EXPECTED RESULT");

    }
    // endregion

}