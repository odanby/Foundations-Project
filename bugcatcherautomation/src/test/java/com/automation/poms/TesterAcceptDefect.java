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

public class TesterAcceptDefect {
    
    private WebDriver driver;

    public TesterAcceptDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Entering in mission number
    @FindBy(id = "mission-number")  
    public WebElement testerEnterDefectNameAccept; 

    public void testerEnterDefectNameAccept(String missionNumberAccept){
        this.testerEnterDefectNameAccept.sendKeys(missionNumberAccept);
    }

    // Open dropdown of decline or accept, press accept
    public void dropdownAccept(){
        Select dropdownAcceptChoice = new Select(driver.findElement(By.id("accept-or-decline")));
        String dropdownAcceptOption = "Accepted";
        dropdownAcceptChoice.selectByValue(dropdownAcceptOption);

        List<WebElement> dropdownAcceptOptions = dropdownAcceptChoice.getAllSelectedOptions();
        assertEquals(1, dropdownAcceptOptions.size());
        assertEquals(dropdownAcceptOption, dropdownAcceptOptions.get(0).getAttribute("value"));
    }

    // Press update button
    @FindBy(id = "accept-or-decline-mission")
    public WebElement updateAcceptMission;

    public void updateAcceptMissionButton(){
        this.updateAcceptMission.click();
        WebDriverWait waitAccept = new WebDriverWait(driver,10);
        waitAccept.until(ExpectedConditions.alertIsPresent());
        Alert alertAccept = driver.switchTo().alert();
        alertAccept.accept();
    }
    
}
