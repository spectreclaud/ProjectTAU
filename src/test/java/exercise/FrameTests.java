package exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testFrameText(){
        var nestedFramesPage = homePage.clickFramesPage();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom text is incorrect");
    }
}
