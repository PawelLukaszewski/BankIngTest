package pl.bankIng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.SingletonWebDriver;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(SingletonWebDriver.getDriver(), this);
    }

    @FindBy(id = "page-loader-overlay-region")
    private WebElement loader;

    @FindBy(xpath = "//div[@class=\"demo-curtain\"]")
    private WebElement waitForCurtainShow;

    @FindBy(xpath = "//a[@class=\"cookie-policy_close js-close-cookie glyphicon glyphicon-ing-close\"]")
    private WebElement coockieButton;

    @FindBy(id = "menu-financemeter")
    private WebElement menuFinancemeter;

    @FindBy(id = "servicesGoals")
    private WebElement servicesGoals;

    @FindBy(id = "goal-new-name")
    private WebElement nameForNewGoal;

    public void waitForCurtineAndClickCoockieButton() {
        SingletonWebDriver.getWait().until(ExpectedConditions.invisibilityOf(loader));
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(waitForCurtainShow));
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(coockieButton));
        coockieButton.click();
    }

    public void clickMenuFinancemeter() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(menuFinancemeter));
        menuFinancemeter.click();
    }

    public void clickServicesGoals() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(servicesGoals));
        servicesGoals.click();
    }


}
