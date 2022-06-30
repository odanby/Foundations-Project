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

public class TesterShelveDefect {

    private WebDriver driver;

    public TesterShelveDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Make status accepted
            // Entering in mission number
            @FindBy(id = "mission-number")  
            public WebElement testerEnterDefectNameAcceptForShelve; 

            public void testerEnterDefectNameAcceptForShelve(String missionNumberAcceptForShelve){
                this.testerEnterDefectNameAcceptForShelve.sendKeys(missionNumberAcceptForShelve);
            }

            // Open dropdown of decline or accept, press accept
            public void dropdownAcceptForShelve(){
                Select dropdownAcceptChoiceForShelve = new Select(driver.findElement(By.id("accept-or-decline")));
                String dropdownAcceptOptionForShelve = "Accepted";
                dropdownAcceptChoiceForShelve.selectByValue(dropdownAcceptOptionForShelve);

                List<WebElement> dropdownAcceptOptionsForShelve = dropdownAcceptChoiceForShelve.getAllSelectedOptions();
                assertEquals(1, dropdownAcceptOptionsForShelve.size());
                assertEquals(dropdownAcceptOptionForShelve, dropdownAcceptOptionsForShelve.get(0).getAttribute("value"));
            }

            // Press update button
            @FindBy(id = "accept-or-decline-mission")
            public WebElement updateAcceptMissionForShelve;

            public void updateAcceptMissionButtonForShelve(){
                this.updateAcceptMissionForShelve.click();
                WebDriverWait waitAcceptForShelve = new WebDriverWait(driver,10);
                waitAcceptForShelve.until(ExpectedConditions.alertIsPresent());
                Alert alertAcceptForShelve = driver.switchTo().alert();
                alertAcceptForShelve.accept();
            }

    // Open dropdown of reject, fix, and shelve and choose shelve
    public void dropdownShelve(){
        Select dropdownShelveChoice = new Select(driver.findElement(By.id("bug-outcome")));
        String dropdownShelveOption = "Shelved";
        dropdownShelveChoice.selectByValue(dropdownShelveOption);

        List<org.openqa.selenium.WebElement> dropdownShelveOptions = dropdownShelveChoice.getAllSelectedOptions();        
        assertEquals(1, dropdownShelveOptions.size());
        assertEquals(dropdownShelveOption, dropdownShelveOptions.get(0).getAttribute("value"));
    }

    // Press update button
    @FindBy(id = "update-mission")
    public WebElement updateShelveMission;

    public void updateShelveMissionButton(){
        this.updateShelveMission.click();
        WebDriverWait waitShelve = new WebDriverWait(driver,10);
        waitShelve.until(ExpectedConditions.alertIsPresent());
        Alert alertShelve = driver.switchTo().alert();
        alertShelve.accept();
    }
    
}
