package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestRegistryPage extends TestBasePage {

    @Test
    public void testBirthdayGiftListButton(){
        Homepage homepage=new Homepage();
        RegistryPage registryPage= homepage.navigateToRegistryPage();
        registryPage.birthdayGiftListButton.click();

    }
    @Test
    public void testSerchingBarDropDownIcon()  {

        Homepage homepage= new Homepage();
        RegistryPage registryPage=homepage.navigateToRegistryPage();
        registryPage.serachingBarDropDownIcon.click();
        registryPage.birthdayGiftListDropDownOption.click();


    }
    @Test
    public void testHelpButton(){

        Homepage homepage= new Homepage();
        RegistryPage registryPage=homepage.navigateToRegistryPage();
        registryPage.helpButton.click();
        registryPage.findMoreSolutionSearchingBar.click();




    }
}
