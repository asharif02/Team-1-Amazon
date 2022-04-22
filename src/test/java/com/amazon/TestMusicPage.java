package com.amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestMusicPage extends TestBasePage {

    // Test Case 1
    @Test
    public void testMusicTab() {
        Homepage homepage = new Homepage();
        MusicPage musicPage = homepage.navigateToMusicPage();
        musicPage.MusicTab.click();
    }
}
