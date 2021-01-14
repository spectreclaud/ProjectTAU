package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwyEditorPage {
    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.xpath(".//button[@title='Increase indent']");

    public WysiwyEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
