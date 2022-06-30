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

public class TesterFixDefect {

    private WebDriver driver;

    public TesterFixDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Make status accepted
            // Entering in mission number
            @FindBy(id = "mission-number")  
            public WebElement testerEnterDefectNameAcceptForFix; 

            public void testerEnterDefectNameAcceptForFix(String missionNumberAcceptForFix){
                this.testerEnterDefectNameAcceptForFix.sendKeys(missionNumberAcceptForFix);
            }

            // Open dropdown of decline or accept, press accept
            public void dropdownAcceptForFix(){
                Select dropdownAcceptChoiceForFix = new Select(driver.findElement(By.id("accept-or-decline")));
                String dropdownAcceptOptionForFix = "Accepted";
                dropdownAcceptChoiceForFix.selectByValue(dropdownAcceptOptionForFix);

                List<WebElement> dropdownAcceptOptionsForFix = dropdownAcceptChoiceForFix.getAllSelectedOptions();
                assertEquals(1, dropdownAcceptOptionsForFix.size());
                assertEquals(dropdownAcceptOptionForFix, dropdownAcceptOptionsForFix.get(0).getAttribute("value"));
            }

            // Press update button
            @FindBy(id = "accept-or-decline-mission")
            public WebElement updateAcceptMissionForFix;

            public void updateAcceptMissionButtonForFix(){
                this.updateAcceptMissionForFix.click();
                WebDriverWait waitAcceptForFix = new WebDriverWait(driver,10);
                waitAcceptForFix.until(ExpectedConditions.alertIsPresent());
                Alert alertAcceptForFix = driver.switchTo().alert();
                alertAcceptForFix.accept();
            }

    // Open dropdown of reject, fix, and shelve and choose fix
    public void dropdownFix(){
        Select dropdownFixChoice = new Select(driver.findElement(By.id("bug-outcome")));
        String dropdownFixOption = "Fixed";
        dropdownFixChoice.selectByValue(dropdownFixOption);

        List<org.openqa.selenium.WebElement> dropdownFixOptions = dropdownFixChoice.getAllSelectedOptions();        
        assertEquals(1, dropdownFixOptions.size());
        assertEquals(dropdownFixOption, dropdownFixOptions.get(0).getAttribute("value"));
    }

    // Press update button
    @FindBy(id = "update-mission")
    public WebElement updateFixMission;

    public void updateFixMissionButton(){
        this.updateFixMission.click();
        WebDriverWait waitFix = new WebDriverWait(driver,10);
        waitFix.until(ExpectedConditions.alertIsPresent());
        Alert alertFix = driver.switchTo().alert();
        alertFix.accept();
    }
}