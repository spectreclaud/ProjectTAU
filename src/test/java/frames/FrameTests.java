package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWisywig(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world people!!!";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text in editor is incorrect");
    }
}
