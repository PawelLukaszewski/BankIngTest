package pl.bankIng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pl.SingletonWebDriver;

public class GoalsPage {
    public GoalsPage() {
        PageFactory.initElements(SingletonWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class=\"btn btn-primary js-button  btn-with-icon\"]")
    private WebElement addGoal;

    @FindBy(xpath = "(//div[@class=\"pie-image-chart_image-container\"])[7]")
    private WebElement childGoal;

    @FindBy(id = "goal-new-name")
    private WebElement nameForNewGoal;

    public void clickAddGoal() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(addGoal));
        addGoal.click();
    }

    public void clickChildGoal() {
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(childGoal));
        Actions actions = new Actions(SingletonWebDriver.getDriver());
        actions.moveToElement(childGoal).click().perform();
    }
    public void addNameForNewGoal(){
        SingletonWebDriver.getWait().until(ExpectedConditions.visibilityOf(nameForNewGoal));
        nameForNewGoal.sendKeys("Obóz rowerowy");
    }
}
