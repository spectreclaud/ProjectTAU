package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\CA_LTD\\ProjektTAU\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded file is incorrect");
    }
}
