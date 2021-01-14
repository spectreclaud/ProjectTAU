package exercise;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextTest extends BaseTests {

    @Test
    public void testContextMenu(){
        var menuPage = homePage.clickContextMenu();
        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message is incorrect");
    }
}
