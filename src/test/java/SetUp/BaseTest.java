package SetUp;

import PageObjects.fxtmPages.LoginPageFXTM;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

/** All the Thread.sleep elements must be changed to wait (Thread is easier to use in this condition);
 *
 *  I am getting troubles with token authorisation automation,
 *  I mean I still need to enter my token password manually;
 *
 *  Note, this is brainstormed architecture, which is absolutely will be
 *  Changed after project approve;
 *
 *
 *
 *  This is the abstract class which is going to contain:
 *      Setup properties;
 *      Robot implemented properties
 *      ...
 */

public abstract class BaseTest {

   private static WebDriver driver;

   public static WebDriver getDriver(){
       return driver;
   }


    @BeforeClass
    public static void baseSetup () throws InterruptedException {

        File chromeDriverFile = new File(
                "C:\\Users\\Robert.Papoyan" +
                        "\\IdeaProjects\\StagingMyFXTM" +
                        "\\src\\test\\resources\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver",chromeDriverFile.getAbsolutePath());

        driver = new ChromeDriver();
        driver.get("https://my.staging.fxtm/en");
//        driver.manage().window().maximize();
        Thread.sleep(10000);

    }

    @Before
    public void checkTheLocation() throws AWTException, InterruptedException {

       if (driver.getCurrentUrl() != "https://my.staging.fxtm/en" ){

           LoginPageFXTM loginPageFXTM = new LoginPageFXTM();
           loginPageFXTM.enterLogin();
           loginPageFXTM.enterPassword();
           loginPageFXTM.clickLoginBtn();

       }
    }

    @AfterClass
    public static void finishOperationByQuit (){
//       driver.quit();
    }



}
