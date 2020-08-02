package PageObjects.fxtmPages;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginPageFXTM extends BasePage {

    public LoginPageFXTM (){
        super();
    }


    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"password-container\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"auth\"]")
    private WebElement loginBtn;



    public void enterLogin(){
        CharSequence login = "50003814";
        loginField.click();
        loginField.sendKeys(login);
    }

    public void enterPassword() throws AWTException {
        Robot robot = new Robot();
        passwordField.click();

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_NUMPAD1);
        robot.keyRelease(KeyEvent.VK_NUMPAD1);
        robot.keyPress(KeyEvent.VK_NUMPAD2);
        robot.keyRelease(KeyEvent.VK_NUMPAD2);
        robot.keyPress(KeyEvent.VK_NUMPAD3);
        robot.keyRelease(KeyEvent.VK_NUMPAD3);
    }
    public void clickLoginBtn() throws InterruptedException {
        loginBtn.click();
        Thread.sleep(10000);
    }
}
