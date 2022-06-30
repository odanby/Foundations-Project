package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.ManagerCreateDefect;
import com.automation.poms.ManagerLogin;
import com.automation.poms.ManagerLogout;
import com.automation.poms.TesterAcceptDefect;
import com.automation.poms.TesterDeclineDefect;
import com.automation.poms.TesterFixDefect;
import com.automation.poms.TesterLogin;
import com.automation.poms.TesterLogout;
import com.automation.poms.TesterRejectDefect;
import com.automation.poms.TesterShelveDefect;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/automation/steps")

public class TestRunner {
    
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static ManagerLogin managerLogin;
    public static TesterLogin testerLogin;

    public static ManagerLogout managerLogout;
    public static TesterLogout testerLogout;

    public static ManagerCreateDefect managerCreateDefect;

    public static TesterDeclineDefect testerDeclineDefect;
    public static TesterAcceptDefect testerAcceptDefect;

    public static TesterRejectDefect testerRejectDefect;
    public static TesterFixDefect testerFixDefect;
    public static TesterShelveDefect testerShelveDefect;


    @BeforeClass // this makes the method execute BEFORE all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 5);    // note: my manager page wasn't working because it was loading too slowly
        // so i changed the duration time to 5 seconds

        managerLogin = new ManagerLogin(driver);
        testerLogin = new TesterLogin(driver);

        managerLogout = new ManagerLogout(driver);
        testerLogout = new TesterLogout(driver);

        managerCreateDefect = new ManagerCreateDefect(driver);

        testerDeclineDefect = new TesterDeclineDefect(driver);
        testerAcceptDefect = new TesterAcceptDefect(driver);

        testerRejectDefect = new TesterRejectDefect(driver);
        testerFixDefect = new TesterFixDefect(driver);
        testerShelveDefect = new TesterShelveDefect(driver);

    }

    @AfterClass // this makes the method execute AFTER all the steps
    public static void teardown(){
        driver.quit();
    }
}
