package pl.bankIng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.SingletonWebDriver;

public class SavingParametersPage {

    String testToAssert;

    public SavingParametersPage() {
        PageFactory.initElements(SingletonWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@class=\"goal-create-step2-params_start-amount-check_label\"]")
    private WebElement amountCheckBox;

    @FindBy(id = "goal-start-amount")
    private WebElement startAmount;

    @FindBy(id = "goal-new-period")
    private WebElement newPeriod;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block btn-lg js-next-button\"]")
    private WebElement nextButton;

    @FindBy(xpath = "(//div[@class=\"row\"])[6]")
    private WebElement randomclick;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block btn-lg js-send\"]")
    private WebElement agreementButton;

    @FindBy(xpath = "//h4[@class=\"sum_title no-outline-on-focus\"]")
    private WebElement xpathText;

    @FindBy(xpath = "//a[@class=\"link  js-summary-link js-link-id-0\"]")
    private WebElement checkGoeal;


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
        randomclick.click();
        nextButton.click();
        nextButton.click();
    }

    public void clickAgreementButton() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(agreementButton));
        agreementButton.click();
    }

    public String getText() {
        return testToAssert = xpathText.getText();
    }

    public void clickCheckGoeal(){
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(checkGoeal));
        checkGoeal.click();
    }

}
