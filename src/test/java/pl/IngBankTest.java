package pl;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.bankIng.pages.MainPage;

public class IngBankTest {

    MainPage mainPage;


    @AfterTest
    public void afterTest() {
        SingletonWebDriver.quitDriver();
    }

    @BeforeTest
    public void beforeTest() {
        mainPage = new MainPage();
        SingletonWebDriver.getDriver().get("https://login.ingbank.pl/mojeing/demo/#home");
    }


    @Test
    public void bankTest() {
        mainPage.waitForCurtineAndClickCoockieButton();
        mainPage.clickMenuFinancemeter();
    }

}
