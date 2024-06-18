package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logOutText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Log in']")
    WebElement loginText;
    //a[@class='ico-login']


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        Reporter.log("Get welcome message " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Get welcome message");
        return message;
    }


    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
        Reporter.log("Enter EmailId  " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Enter password"+passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("Click on loginButton"+loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public void clickOnLogOutButton()
    {
        clickOnElement(logOutText);
        Reporter.log("Click on log out button"+logOutText.toString());
        CustomListeners.test.log(Status.PASS,"Click on log out button");
    }

    public String getLogOutText()
    {
        String messLogoutText = getTextFromElement(logOutText);
        Reporter.log("Get log out text"+logOutText.toString());
        return messLogoutText;
    }

    public String getLoginText()
    {
        String messLoginText = getTextFromElement(loginText);
        Reporter.log("Get welcome message " + loginText.toString());
        CustomListeners.test.log(Status.PASS, "Get welcome message");
        return messLoginText;
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        Reporter.log("get error message"+errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get errorMessage");
        return message;
    }

}
