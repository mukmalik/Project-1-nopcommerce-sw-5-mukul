package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegisterPageError;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest
{

    HomePage homePage;
    RegisterPage registerPage;
    RegisterPageError registerPageError;


    @BeforeMethod
    public void inIt()
    {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        registerPageError = new RegisterPageError();

    }

    //2.1 verifyUserShouldNavigateToRegisterPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        homePage.clickOnRegisterLink();
        String expectedRegisterText = "Register";
        String actualRegisterText = registerPageError.getRegisterText();
        Assert.assertEquals(expectedRegisterText,actualRegisterText);

    }

    //2.2 verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
    {
        homePage.clickOnRegisterLink();
        registerPageError.clickOnRegisterButton();

        Assert.assertEquals(registerPageError.getVerifyFirstNameError(),"First name is required.");
        Assert.assertEquals(registerPageError.getVerifyLastNameError(),"Last name is required.");
        Assert.assertEquals(registerPageError.getVerifyEmailError(),"Email is required.");
        Assert.assertEquals(registerPageError.getVerifyConfirmPasswordError(),"Password is required.");
    }

    //2.3 verifyThatUserShouldCreateAccountSuccessfully()
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully()
    {
        homePage.clickOnRegisterLink();
        registerPage.clickRadioButtonGenderFemale();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.selectDayForDOB();
        registerPage.selectMonthForDOB();
        registerPage.selectYearForDOB();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.getVerifyRegistrationCompleted(),"Your registration completed");
    }

}
