package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestMusicPage extends TestBasePage {

    // TestCase1, Navigate to Music page
    @Test
    public void testMusicTab() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.MusicTab.click();
    }

    // TestCase2, Try it free button
    @Test
    public void testTryItFreeButton() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.TryItFreeButton.click();
        }

    // TestCase3, Open web player
    @Test
    public void testOpenWebPlayer() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.OpenWebPlayer.click();
    }

    // TestCase4, see more the HD difference
    @Test
    public void testSeeMoreHDDifference() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.SeeMoreHDDifference.click();
    }

    // TestCase5, Amazon music prime
    @Test
    public void testAmazonMusicPrime() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.AmazonMusicPrime.click();
    }

    // TestCase6, Sign in with Email & Password values
    // you can add throws InterruptedException in the method, therefore wait can work
    // Thread.sleep(1000)=1 second under a code, therefore it will give it a wait
    // Just in case it was runs too fast
    @Test
    public void testSignInEmail() throws InterruptedException {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.TryItFreeButton.click();
        Thread.sleep(1000);
        musicPage.SignInEmail.click();
        musicPage.SignInEmail.sendKeys("KylieJenner@gmail.com");
        musicPage.SignInPassword.click();
        musicPage.SignInPassword.sendKeys("Baby123$");
        musicPage.SignInSubmit.click();
    }
}
