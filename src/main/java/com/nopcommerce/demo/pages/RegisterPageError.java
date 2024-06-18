package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPageError extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(name = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement errorFirstN;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement errorLastN;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement errorEmail;


    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement errorConfirmPass;


    public String getRegisterText() {
        String registerText = getTextFromElement(registerLink);
        return registerText;
    }
    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }

    public String getVerifyFirstNameError()
    {
        return getTextFromElement(errorFirstN);
    }

    public String getVerifyLastNameError()
    {
        return getTextFromElement(errorLastN);
    }

    public String getVerifyEmailError()
    {
        return getTextFromElement(errorEmail);
    }

    public String getVerifyConfirmPasswordError()
    {
        return getTextFromElement(errorConfirmPass);
    }



}
