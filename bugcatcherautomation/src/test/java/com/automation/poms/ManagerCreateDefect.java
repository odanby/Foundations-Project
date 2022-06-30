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

public class ManagerCreateDefect {
    
    private WebDriver driver;

    public ManagerCreateDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Creating Defect Name
    @FindBy(id = "defect-name")
    public WebElement defectNameInput;

    public void createDefectName(String defectName){
        this.defectNameInput.sendKeys(defectName);
    }

    // Creating Defect Description
    @FindBy(id = "defect-desc")
    public WebElement defectDescInput;

    public void createDefectDesc(String defectDesc){
        this.defectDescInput.sendKeys(defectDesc);
    }

    // Assigning a tester
    public void assignTesterChoice(){
        Select testerChoice = new Select(driver.findElement(By.id("defect-select")));
        String testerOption = "BeastBoy";
        testerChoice.selectByValue(testerOption);

        List<WebElement> assignTesterOptions = testerChoice.getAllSelectedOptions();
        assertEquals(1, assignTesterOptions.size());
        assertEquals(testerOption, assignTesterOptions.get(0).getAttribute("value"));
    }

    // Clicking tester confirm assignment
    @FindBy(id = "confirm-assignment")
    public WebElement confirmCreateAssignDefect;

    public void confirmCreateAssignDefectButton(){
        driver.manage().window().maximize();
        this.confirmCreateAssignDefect.click();

        WebDriverWait waitAlert = new WebDriverWait(driver,10);
        waitAlert.until(ExpectedConditions.alertIsPresent());
        Alert alertAlert = driver.switchTo().alert();
        alertAlert.accept(); 
    }

   
    

}
