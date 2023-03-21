package airelogic.pages;

import airelogic.base.BasePage;
import airelogic.utils.Links;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage {
    private final By inputField = By.xpath("//input[@name='name']");
    private final By startButton = By.xpath("//button[contains(.,'Start!')]");
    private final By newGameText = By.xpath("//h2[contains(.,'New Game')]");

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void enterAPlayerName(String playerName){
        enterText(inputField, playerName);
    }

    public void clickOnStartButton(){
        clickElement(startButton);
    }

    public void getHomePageUrl(){
        getPageUrl(Links.HOME);
    }

    public boolean isNewGameTextDisplayed(){
        return isElementVisible(newGameText);
    }

    public String randomPlayerName(){
        return RandomStringUtils.randomAlphabetic(10);
    }

}
