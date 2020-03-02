package pl;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.bankIng.pages.GoalsPage;
import pl.bankIng.pages.MainPage;

public class IngBankTest {

    MainPage mainPage;
    GoalsPage goalsPage;


//    @AfterTest
//    public void afterTest() {
//        SingletonWebDriver.quitDriver();
//    }

    @BeforeTest
    public void beforeTest() {
        mainPage = new MainPage();
        goalsPage = new GoalsPage();
        SingletonWebDriver.getDriver().get("https://login.ingbank.pl/mojeing/demo/#home");
    }


    @Test
    public void bankTest() {
        mainPage.waitForCurtineAndClickCoockieButton();
        mainPage.clickMenuFinancemeter();
        mainPage.clickServicesGoals();
        goalsPage.clickAddGoal();
        goalsPage.clickChildGoal();
        goalsPage.addNameForNewGoal();
        goalsPage.addNewGoalAmount();
        goalsPage.clickNextButton();
        goalsPage.clickNextButton();
        goalsPage.clickNextButton();
    }

}
