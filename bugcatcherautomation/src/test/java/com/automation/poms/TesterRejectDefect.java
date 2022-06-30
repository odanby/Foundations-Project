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

public class TesterRejectDefect {

    private WebDriver driver;

    public TesterRejectDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Make status accepted
            // Entering in mission number
            @FindBy(id = "mission-number")  
            public WebElement testerEnterDefectNameAcceptForReject; 

            public void testerEnterDefectNameAcceptForReject(String missionNumberAcceptForReject){
                this.testerEnterDefectNameAcceptForReject.sendKeys(missionNumberAcceptForReject);
            }

            // Open dropdown of decline or accept, press accept
            public void dropdownAcceptForReject(){
                Select dropdownAcceptChoiceForReject = new Select(driver.findElement(By.id("accept-or-decline")));
                String dropdownAcceptOptionForReject = "Accepted";
                dropdownAcceptChoiceForReject.selectByValue(dropdownAcceptOptionForReject);

                List<WebElement> dropdownAcceptOptionsForReject = dropdownAcceptChoiceForReject.getAllSelectedOptions();
                assertEquals(1, dropdownAcceptOptionsForReject.size());
                assertEquals(dropdownAcceptOptionForReject, dropdownAcceptOptionsForReject.get(0).getAttribute("value"));
            }

            // Press update button
            @FindBy(id = "accept-or-decline-mission")
            public WebElement updateAcceptMissionForReject;

            public void updateAcceptMissionButtonForReject(){
                this.updateAcceptMissionForReject.click();
                WebDriverWait waitAcceptForReject = new WebDriverWait(driver,10);
                waitAcceptForReject.until(ExpectedConditions.alertIsPresent());
                Alert alertAcceptForReject = driver.switchTo().alert();
                alertAcceptForReject.accept();
            }

    // Open dropdown of reject, fix, and shelve and choose reject
    public void dropdownReject(){
        Select dropdownRejectChoice = new Select(driver.findElement(By.id("bug-outcome")));
        
        String dropdownRejectOption = "Rejected";
        dropdownRejectChoice.selectByValue(dropdownRejectOption);

        List<org.openqa.selenium.WebElement> dropdownRejectOptions = dropdownRejectChoice.getAllSelectedOptions();        
        assertEquals(1, dropdownRejectOptions.size());
        assertEquals(dropdownRejectOption, dropdownRejectOptions.get(0).getAttribute("value"));
    }

    // Press update button
    @FindBy(id = "update-mission")
    public WebElement updateRejectMission;

    public void updateRejectMissionButton(){
        this.updateRejectMission.click();
        WebDriverWait waitReject = new WebDriverWait(driver,10);
        waitReject.until(ExpectedConditions.alertIsPresent());
        Alert alertReject = driver.switchTo().alert();
        alertReject.accept();
    }
    
}