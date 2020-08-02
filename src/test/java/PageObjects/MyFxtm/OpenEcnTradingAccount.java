package PageObjects.MyFxtm;

import PageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenEcnTradingAccount extends BasePage {

    public OpenEcnTradingAccount() {
        super();
    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/data-ng-include/div/div[1]/div/div[2]/div[1]/div/div[2]/span/label")
    private WebElement selectUsdCurrencyRadioBtn;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/data-ng-include/div/div[1]/div/div[2]/div[7]/div/div/input")
    private WebElement tradingAccountPasswordField;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/data-ng-include/div/div[1]/div/div[2]/div[8]/div/div/input")
    private WebElement tradingAccountPasswordRepeatField;

    @FindBy(xpath = "//*[@id=\"wizard\"]/div[1]/data-ng-include/div/div[1]/div/div[2]/div[11]/div/button")
    private WebElement openTradingAccountBtn;

    CharSequence tradingAccountPassword = "Asdasd123";

    public void selectUsdCurrencyRadioBtnClick(){
        selectUsdCurrencyRadioBtn.click();
    }

    public void tradingAccountPasswordFieldClickAndFill() throws InterruptedException {
        tradingAccountPasswordField.click();
        tradingAccountPasswordField.sendKeys(tradingAccountPassword);
        Thread.sleep(1000);
    }

    public void tradingAccountPasswordRepeatFieldClickAndFill() throws InterruptedException {
        tradingAccountPasswordRepeatField.click();
        tradingAccountPasswordRepeatField.sendKeys(tradingAccountPassword);
        Thread.sleep(1000);
    }

    public void openTradingAccountBtnClick() throws InterruptedException {
        openTradingAccountBtn.click();
        Thread.sleep(3000);
    }
}
