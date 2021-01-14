package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExemple1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Waiting text is incorrect");
    }
}
