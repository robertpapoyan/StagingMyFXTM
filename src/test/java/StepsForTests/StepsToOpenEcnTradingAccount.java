package StepsForTests;

import PageObjects.MyFxtm.DashboardPage;
import PageObjects.MyFxtm.LiveDevoAccountOpenPage;
import PageObjects.MyFxtm.OpenEcnTradingAccount;

public class StepsToOpenEcnTradingAccount {

    private DashboardPage dashboardPage = new DashboardPage();
    private LiveDevoAccountOpenPage liveDevoAccountOpenPage = new LiveDevoAccountOpenPage();
    private OpenEcnTradingAccount openEcnTradingAccount = new OpenEcnTradingAccount();

    public void stepsToOpenEcnTradingAccount() throws InterruptedException {

        dashboardPage.openLiveDemoAccountBtnClick();

        liveDevoAccountOpenPage.selectEcnAccountBtnClick();

        openEcnTradingAccount.selectUsdCurrencyRadioBtnClick();
        openEcnTradingAccount.tradingAccountPasswordFieldClickAndFill();
        openEcnTradingAccount.tradingAccountPasswordRepeatFieldClickAndFill();

        openEcnTradingAccount.openTradingAccountBtnClick();
    }
}
