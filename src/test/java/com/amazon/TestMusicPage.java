package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestMusicPage extends TestBasePage {

    // Test Case 1, Navigate to Music page
    @Test
    public void testMusicTab() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.MusicTab.click();
    }

    // Test Case 2, Try it free button
    @Test
    public void testTryItFreeButton() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.MusicTab2.click();
        musicPage.TryItFreeButton.click();
        }

    // Test Case 3, Open web player
    @Test
    public void testOpenWebPlayer() {
        Homepage homepage = new Homepage();
        MusicPage openWebPlayer = homepage.navigateToMusicPage();
        openWebPlayer.OpenWebPlayer.click();
    }
}
