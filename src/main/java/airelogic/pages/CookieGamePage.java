package airelogic.pages;

import airelogic.base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookieGamePage extends BasePage {

    private static By cookieClickerLinkText = By.xpath("//a[contains(text(),'Cookie Clicker!')]");
    private static By clickCookieButton = By.id("click");
    private static By sellCookiesInputField = By.id("cookies-to-sell");
    private static By sellCookiesButton = By.id("sell-cookies");
    private static By buyFactoriesInputField = By.id("factories-to-buy");
    private static By buyFactoriesButton = By.id("Buy Factories!");

    public CookieGamePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCookieClicker(){
        clickElement(cookieClickerLinkText);
    }
    public void clickOnClickCookie(){
        clickElement(clickCookieButton);
    }

    public void enterNumberOfCookiesToSell(String numberofCookiesToSell){
        enterText(sellCookiesInputField, numberofCookiesToSell);
    }

    public void clickOnSellCookiesButton(){
        clickElement(sellCookiesButton);
    }

    public void enterNumberOfFactoriesToBuy(String numberOfFactories){
        enterText(buyFactoriesInputField, numberOfFactories);
    }

    public void clickOnBuyFactoriesButton(){
        clickElement(buyFactoriesButton);
    }


}
