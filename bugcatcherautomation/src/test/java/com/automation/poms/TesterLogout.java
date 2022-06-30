package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesterLogout {

    private WebDriver driver;

    public TesterLogout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "logout")
        public WebElement testerLogoutButton;

    public void testerClickLogoutButton(){
        this.testerLogoutButton.click();
        WebDriverWait waitTesterLogout = new WebDriverWait(driver,10);
        waitTesterLogout.until(ExpectedConditions.alertIsPresent());
        Alert alertTesterLogout = driver.switchTo().alert();
        alertTesterLogout.accept();

        WebDriverWait waitTesterLogoutNow = new WebDriverWait(driver,10);
        waitTesterLogoutNow.until(ExpectedConditions.alertIsPresent());
        Alert alertTesterLogoutNow = driver.switchTo().alert();
        alertTesterLogoutNow.accept();
    }
}
