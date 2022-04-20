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
}
