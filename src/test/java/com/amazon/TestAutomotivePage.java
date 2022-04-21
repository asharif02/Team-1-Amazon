package com.amazon;

import base.TestBasePage;
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
    public void testoilnFluidsButton(){
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
}
