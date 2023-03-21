package com.airelogic_tests.step_definitions;

import airelogic.pages.CookieGamePage;
import airelogic.pages.Homepage;
import com.airelogic_tests.utils.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CookieClickerTestSteps extends BaseTest {
    private static WebDriver driver;
    private String pageTitle;
    private String playerName;

    @Before
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
    @Given("CookieClicker homepage is displayed")
    public void cookie_clicker_homepage_is_displayed() {
       homepage = new Homepage(driver);
       homepage.getHomePageUrl();
       pageTitle = driver.getTitle();
    }
    @Then("the cookieClicker homepage is displayed to the player")
    public void the_cookie_clicker_homepage_is_displayed_to_the_player() {
        System.out.println(pageTitle);
        assertEquals("Cookie Clicker!", pageTitle);
        assertTrue(homepage.isNewGameTextDisplayed());
    }

    @When("the player enters a {string}")
    public void the_player_enters_a(String player) {
        playerName = player;
        homepage.enterAPlayerName(playerName);
    }

    @When("the player clicks on Start button")
    public void the_player_clicks_on_start_button() {
        homepage.clickOnStartButton();
    }

    @Then("the CookieClicker! game page should be displayed")
    public void the_cookie_clicker_game_page_should_be_displayed() {
        String actualResult = driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
        String expectedResult = "Hello "+playerName;

        if(playerName.equals("")){
            System.out.println(actualResult);
            assertEquals("Hello", actualResult);
        }else{
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult);
        }
    }

    @Given("the player enters a name")
    public void the_player_enters_a_name() {
        playerName = homepage.randomPlayerName();
        System.out.println(playerName);
        homepage.enterAPlayerName(playerName);
    }
    @When("the player clicks on Click Cookie!")
    public void the_player_clicks_on_click_cookie() {
        cookieGamePage = new CookieGamePage(driver);
        cookieGamePage.clickOnClickCookie();
    }

    @Then("the value of Cookies should increase by {string}")
    public void the_value_of_cookies_should_increase_by(String numberOfCookies) {
        String actualResult = driver.findElement(By.xpath("//span[@id='cookies']")).getText();
        assertEquals(numberOfCookies, actualResult);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
