package pl;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.bankIng.pages.GoalsPage;
import pl.bankIng.pages.MainPage;
import pl.bankIng.pages.SavingParametersPage;

public class IngBankTest {

    MainPage mainPage;
    GoalsPage goalsPage;
    SavingParametersPage savingParametersPage;


//    @AfterTest
//    public void afterTest() {
//        SingletonWebDriver.quitDriver();
//    }

    @BeforeTest
    public void beforeTest() {
        mainPage = new MainPage();
        goalsPage = new GoalsPage();
        savingParametersPage = new SavingParametersPage();
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
        savingParametersPage.clickAmountCheckBox();
        savingParametersPage.changeNewPeriod();
        savingParametersPage.addStartAmount();
        savingParametersPage.clickNextButton();
        savingParametersPage.clickAgreementButton();
        Assert.assertEquals(savingParametersPage.getText(), "Twój cel został utworzony, życzymy powodzenia w oszczędzaniu");
        savingParametersPage.clickCheckGoeal();
    }

}
