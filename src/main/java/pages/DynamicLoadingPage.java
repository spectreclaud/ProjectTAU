package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Exemple1 = By.xpath(String.format(linkXpath_Format, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExemple1Page clickExemple1(){
        driver.findElement(link_Exemple1).click();
        return new DynamicLoadingExemple1Page(driver);
    }
}
