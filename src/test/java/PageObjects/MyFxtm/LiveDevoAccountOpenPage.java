package PageObjects.MyFxtm;

import PageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveDevoAccountOpenPage extends BasePage {

    public LiveDevoAccountOpenPage() {
        super();
    }

    @FindBy(xpath = "//*[@id=\"wizard\"]/div/div[2]/div/div[2]/div/a")
            private WebElement selectEcnAccountBtn;

    public void selectEcnAccountBtnClick() throws InterruptedException {
        selectEcnAccountBtn.click();
        Thread.sleep(5000);
    }
}
