package com.automation.poms;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesterDeclineDefect {

    private WebDriver driver;

    public TesterDeclineDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Entering in mission number
    @FindBy(id = "mission-number")  
    public WebElement testerEnterDefectNameDecline; 

    public void testerEnterDefectNameDecline(String missionNumberDecline){
        this.testerEnterDefectNameDecline.sendKeys(missionNumberDecline);
    }

    // Open dropdown of decline or accept, press decline
    public void dropdownDecline(){
        Select dropdownDeclineChoice = new Select(driver.findElement(By.id("accept-or-decline")));
        String dropdownDeclineOption = "Declined";
        dropdownDeclineChoice.selectByValue(dropdownDeclineOption);

        List<WebElement> dropdownDeclineOptions = dropdownDeclineChoice.getAllSelectedOptions();
        assertEquals(1, dropdownDeclineOptions.size());
        assertEquals(dropdownDeclineOption, dropdownDeclineOptions.get(0).getAttribute("value"));
    }

    // Press update button
    @FindBy(id = "accept-or-decline-mission")
    public WebElement updateDeclineMission;

    public void updateDeclineMissionButton(){
        this.updateDeclineMission.click();
        WebDriverWait waitDecline = new WebDriverWait(driver,10);
        waitDecline.until(ExpectedConditions.alertIsPresent());
        Alert alertDecline = driver.switchTo().alert();
        alertDecline.accept();
    }
}
