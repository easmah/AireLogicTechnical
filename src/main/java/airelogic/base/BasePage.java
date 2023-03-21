package airelogic.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;
    WebElement element = null;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //Locate and click element with no wait time
    public void clickElement(By by){
        driver.findElement(by).click();
    }

    public void enterText(By by, String text){
        element= driver.findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public void getPageUrl(String url){
        driver.get(url);
    }

    public boolean isElementVisible(By by){
        return driver.findElement(by).isDisplayed();
    }
}
