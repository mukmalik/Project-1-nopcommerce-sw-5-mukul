package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest
{

    ComputerPage computerPage;
    HomePage homePage;
    DesktopsPage desktopsPage;

    @BeforeMethod
    public void inIt()
    {
        computerPage = new ComputerPage();
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully()
    {
        computerPage.clickOnComputerTab();
        Assert.assertEquals(computerPage.getVerifyComputerTab(),"Computers");
        desktopsPage.clickOnDesktopsLink();
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        computerPage.clickOnComputerTab();
        desktopsPage.clickOnDesktopsLink();
        Assert.assertEquals(desktopsPage.getVerifyDesktopsText(),"Desktops");
    }

    @Test
    public void  verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software)
    {
        computerPage.clickOnComputerTab();
        desktopsPage.clickOnDesktopsLink();
        desktopsPage.clockOnBuildYourOwnComputer();
        desktopsPage.selectDropDownProcesser();
        desktopsPage.selectDropDownRam();
        desktopsPage.clickRadioButtonHDD320();
        desktopsPage.clickRadioButtonOSVistaHome();
        desktopsPage.clickOnCheckBoxSoftwareMicrosoftOffice();
        desktopsPage.clickOnAddToChatButton();
        Assert.assertEquals(desktopsPage.getVerifyMessageTheProductHasBeenAddedToYourShoppingCart(),"The product has been added to your shopping cart");
    }


}
