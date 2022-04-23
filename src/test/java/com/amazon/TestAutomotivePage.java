package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestAutomotivePage extends TestBasePage {

    @Test
    public void testCarCareButton() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption.click();
        automotivePage.searchSubmitButton.click();
        automotivePage.carCareButton.click();
    }

    @Test
    public void testoilnFluidsButton() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption2.click();
        automotivePage.searchSubmitButton2.click();
        automotivePage.oilnFluidsButton.click();
    }

    @Test
    public void testoilFluidPumpItem() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption3.click();
        automotivePage.searchSubmitButton3.click();
        automotivePage.oilnFluidsButton3.click();
        automotivePage.oilnFluidPumpItem.click();
    }

    @Test
    public void testfluidPumpVideo() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption4.click();
        automotivePage.searchSubmitButton4.click();
        automotivePage.oilnFluidsButton4.click();
        automotivePage.oilnFluidPumpItem4.click();
        automotivePage.fluidPumpVideo.click();
    }

    @Test
    public void testAddingVehicle() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption5.click();
        automotivePage.searchSubmitButton5.click();
        automotivePage.bestSellerButton.click();
        automotivePage.bestSellerInAutomotive.click();
        automotivePage.addingComboItemsToCart.click();

    }

    @Test
    public void shoppingMobil1() {
        Homepage homepage = new Homepage();
        AutomotivePage automotivePage = homepage.navigateToAutomotivePage();
        automotivePage.automotiveScrollOption6.click();
        automotivePage.searchSubmitButton6.click();
        automotivePage.shopNowButton.click();
        automotivePage.searchBar.sendKeys("Mobil 1");
        automotivePage.searchBar.sendKeys(Keys.ENTER);
    }
}
