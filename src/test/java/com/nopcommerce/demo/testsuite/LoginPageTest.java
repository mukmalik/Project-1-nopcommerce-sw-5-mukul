package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest
{
    HomePage homePage;
    LoginPage loginPage;


    @BeforeMethod
    public void inIt()
    {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    // 1.1.userShouldNavigateToLoginPageSuccessFully().
    @Test
    public void userShouldNavigateToLoginPageSuccessFully()
    {
        homePage.clickOnLoginLink();
    }

    // 1.2. verifyTheErrorMessageWithInValidCredentials().
    @Test(groups = {"smoke", "regression"}, dataProvider = "invalidCredentials", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String email, String password)
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage();
    }

    //1.3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
    @Test(groups = {"smoke", "regression"}, dataProvider = "invalidCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String email, String password)
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        String expectedLinkText = "Log out";
        String actualLinkText = loginPage.getLogOutText();
        Assert.assertEquals(expectedLinkText,actualLinkText);
    }

    //1.4. verifyThatUserShouldLogOutSuccessFully()
    @Test(groups = {"smoke", "regression"}, dataProvider = "invalidCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogOutSuccessFully(String email, String password)
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutButton();
        String expectedLoginText = "Log in";
        String actualLoginText = loginPage.getLoginText();
        Assert.assertEquals(expectedLoginText,actualLoginText);

    }



}
