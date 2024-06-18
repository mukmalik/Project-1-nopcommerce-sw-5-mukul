package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;


    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;


    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement radioButtonGenderFemale;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;


    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dayDOB;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthDOB;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearDOB;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(className = "result")
    WebElement verifyRegistrationCompleted;


    public void enterFirstName() {
        sendTextToElement(firstNameField, "Abc");
    }

    public void enterLastName() {
        sendTextToElement(lastNameField, "Xyz");
    }
    public void clickRadioButtonGenderFemale()
    {
        clickOnElement(radioButtonGenderFemale);
    }
    public void selectDayForDOB()
    {
        selectByValueFromDropDown(dayDOB, "8");
    }

    public void selectMonthForDOB()
    {
        selectByValueFromDropDown(monthDOB, "2");
    }

    public void selectYearForDOB()
    {
        selectByValueFromDropDown(yearDOB, "1998");
    }

    public void enterEmail() {
        sendTextToElement(emailField, "testn123@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "abc123");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPasswordField, "abc123");
    }

    public void clickRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getVerifyRegistrationCompleted() {
        return getTextFromElement(verifyRegistrationCompleted);
    }

}
