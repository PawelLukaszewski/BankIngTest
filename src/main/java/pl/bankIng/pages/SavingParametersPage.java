package pl.bankIng.pages;

import org.openqa.selenium.support.PageFactory;
import pl.SingletonWebDriver;

public class SavingParametersPage {

    public SavingParametersPage() {
        PageFactory.initElements(SingletonWebDriver.getDriver(), this);
    }
}
