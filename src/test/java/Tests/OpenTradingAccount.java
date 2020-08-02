package Tests;

import PageObjects.MyFxtm.DashboardPage;
import PageObjects.fxtmPages.LoginPageFXTM;
import SetUp.BaseTest;
import StepsForTests.StepsToOpenEcnTradingAccount;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class OpenTradingAccount extends BaseTest {


    public OpenTradingAccount() {
        super();
    }

    @Test
    public void OpenEcnTradingAccountTest() throws InterruptedException, AWTException {

        StepsToOpenEcnTradingAccount steps = new StepsToOpenEcnTradingAccount();
        steps.stepsToOpenEcnTradingAccount();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://my.staging.fxtm/en/deposits"));
    }
}
