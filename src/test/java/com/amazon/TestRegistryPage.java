package com.amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRegistryPage extends TestBasePage {

// Test case #1
    @Test
    public void testBirthdayGiftListButton(){
        Homepage homepage=new Homepage();
        RegistryPage registryPage= homepage.navigateToRegistryPage();
        registryPage.KidsBirthdaysButton.click();

    }
    // Test case #2
    @Test
    public void testSerchingBarDropDownIcon()  {

        Homepage homepage= new Homepage();
        RegistryPage registryPage=homepage.navigateToRegistryPage();
        registryPage.serachingBarDropDownIcon.click();
        registryPage.birthdayGiftListDropDownOption.click();


    }
    //Test case #3

    @Test
    public void testHelpButton(){

        Homepage homepage= new Homepage();
        RegistryPage registryPage=homepage.navigateToRegistryPage();
        registryPage.helpButton.click();
        registryPage.findMoreSolutionSearchingBar.sendKeys("Return Policy");
        registryPage.findMoreSolutionSearchingBar.sendKeys(Keys.ENTER);

        String actualtext=driver.findElement(By.xpath("(//*[@id='a-page']//h2)[1]")).getText();
        String expectedtext="Returns & Refunds";
        Assert.assertEquals(actualtext,expectedtext);


    }
    //Test case #4

    @Test
    public void testCustomGiftListButton(){

        Homepage homepage = new Homepage();
        RegistryPage registryPage=homepage.navigateToRegistryPage();
        registryPage.customGiftListButton.click();
        registryPage.createAcustomGiftList.click();

    }






    }

