package com.amazon;

import org.testng.annotations.Test;

public class TestHomepage {

    @Test
    public void testAccessToRegistryPage(){
        Homepage homepage = new Homepage();
        homepage.navigateToRegistryPage();
    }

    @Test
    public void testAccessToAmazonHomePage(){
        Homepage homepage = new Homepage();
        homepage.navigateToAmazonHomePage();
    }
    @Test
    public void testAccessToAutomotivePage(){
        Homepage homepage = new Homepage();
        homepage.navigateToAutomotivePage();
    }
    @Test
    public void testAccessToBooksPage(){
        Homepage homepage = new Homepage();
        homepage.navigateToBooksPage();
    }
    @Test
    public void testAccessToFashionPage(){
        Homepage homepage = new Homepage();
        homepage.navigateToFashionPage();
    }


    @Test
    public void testAccessToMusicPage(){
        Homepage homepage = new Homepage();
        homepage.navigateToMusicPage();
    }
}
