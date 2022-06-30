package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is going to be my Java version of my login webpage
public class TesterLogin {
    /*
     * By defining what web elements you want to interact with here instead of in the steps themselves, we avoid writing "boilerplate" code, aka
     * redundant/repetitive code
     */

    // these web elements need to be referenced in our steps so they are public
    @FindBy(id = "username")    // this tells the PageFactory to find the element with the id username and assign it to this field
    public WebElement testerUsernameInput; 

    // this tells the PageFactory to find the element with the id password and assign it to this field
    @FindBy(id = "password")
    public WebElement testerPasswordInput;

    // this tells the PageFactory to find the element with the id login-button and assign it to this field
    // you can also do (tagName = "button") and it would find the first button on the page
    @FindBy(id = "login-button")
    public WebElement testerLoginButton;

    public TesterLogin(WebDriver driver){
        /*
         * The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields.
         * We simply provide the initElements() method with the private driver we intialize above, and the PageFactory class handles the rest
         */
        PageFactory.initElements(driver, this);
    }

    /*
     * These methods are public so we can access them in the steps, and their return type is void because the functions do not return any
     * values: they just interact with the web page
     */

    // this method will allow both managers and testers to enter their usernames
    public void testerEnterUsername(String username){
        // to enter a username into the input element, we use the sendKeys method
        this.testerUsernameInput.sendKeys(username);
    }

    // this method will allow both managers and testers to enter their passwords
    public void testerEnterPassword(String password){
        
        // to enter a password into the input element, we use the sendKeys method again
        this.testerPasswordInput.sendKeys(password);
    }

    // this method will make Selenium click on our login button
    public void testerClickLoginButton(){

        // to click on an element, you just use the click() method
        this.testerLoginButton.click();
    }
}
