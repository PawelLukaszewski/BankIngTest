package pl.bankIng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.SingletonWebDriver;

public class SavingParametersPage {

    public SavingParametersPage() {
        PageFactory.initElements(SingletonWebDriver.getDriver(), this);
    }

    //    @FindBy(id = "startAmountCheck")
    @FindBy(xpath = "//label[@class=\"goal-create-step2-params_start-amount-check_label\"]")
    private WebElement amountCheckBox;

    @FindBy(id = "goal-start-amount")
    private WebElement startAmount;

    @FindBy(id = "goal-new-period")
    private WebElement newPeriod;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block btn-lg js-next-button\"]")
    private WebElement nextButton;


    public void clickAmountCheckBox() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(amountCheckBox));
        amountCheckBox.click();
    }

    public void addStartAmount() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(startAmount));
        startAmount.sendKeys("20");
    }


    public void changeNewPeriod() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(newPeriod));
        newPeriod.clear();
        newPeriod.sendKeys("6");
    }

    public void clickNextButton() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
        nextButton.click();
        nextButton.click();
    }
}
