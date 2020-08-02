package PageObjects.MyFxtm;

import PageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    public DashboardPage() {
        super();
    }

    @FindBy(xpath = "//*[@id=\"panel_my_accounts\"]/div[2]/div[2]/a[1]")
            private WebElement openLiveDemoAccountBtn;




    public void openLiveDemoAccountBtnClick() throws InterruptedException {
        openLiveDemoAccountBtn.click();
        Thread.sleep(1000);
    }
}
