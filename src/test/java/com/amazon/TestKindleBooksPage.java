package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestKindleBooksPage extends TestBasePage {



    @Test
    public  void  testKindleUnlimitedCheckbox() throws InterruptedException {
    Homepage homepage = new Homepage();
    KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
    Thread.sleep(1500);
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

    @Test
    public void testPublicReadingCheckbox(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        kindleBooksPage.primeReadingCheckbox.click();


    }

    @Test
    public  void testRileyThornBook(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        kindleBooksPage.rileyThornBook.click();

}

    @Test
    public void testBestSellersAndMoreTab(){
        Homepage homepage = new Homepage();
        KindleBooksPage kindleBooksPage = homepage.navigateToKindleBooksPage();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        kindleBooksPage.bestSellersAndMoreTab.click();


    }


}
