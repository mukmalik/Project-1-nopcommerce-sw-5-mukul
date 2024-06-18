package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility
{

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement verifyDesktopText;

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement selectDropDownProcessor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement selectDropDownRam;

    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement clickRadioButtonHDD320;

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement clickRadioButtonOSVistaHome;

    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement clickOnCheckBoxSoftwareMicrosoftOffice;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement clickOnAddToChatButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyAddToShoppingCart;

//    public String getWelcomeText() {
//        String message = getTextFromElement(welcomeText);
//        Reporter.log("Get welcome message " + welcomeText.toString());
//        CustomListeners.test.log(Status.PASS, "Get welcome message");
//        return message;
//    }


    public void clickOnDesktopsLink()
    {
        clickOnElement(desktopsLink);
        Reporter.log("Click on desktop link"+desktopsLink.toString());
        CustomListeners.test.log(Status.PASS,"click on desktop link");
    }
    public String getVerifyDesktopsText()
    {
        Reporter.log("Get verify desktop text"+verifyDesktopText.toString());
        CustomListeners.test.log(Status.PASS,"verify desktop text");
        return getTextFromElement(verifyDesktopText);

    }
    public void clockOnBuildYourOwnComputer()
    {
        clickOnElement(buildYourOwnComputer);
        Reporter.log("click on build your own computer"+buildYourOwnComputer.toString());
        CustomListeners.test.log(Status.PASS,"click on build your own compute");
    }
    public void selectDropDownProcesser()
    {
        selectByValueFromDropDown(selectDropDownProcessor,"1");
        Reporter.log("select processor from drop down"+selectDropDownProcessor.toString());
        CustomListeners.test.log(Status.PASS,"select processor from drop down");
    }
    public void selectDropDownRam()
    {
        selectByValueFromDropDown(selectDropDownRam,"3");
        Reporter.log("select Ram from drop down"+selectDropDownRam);
        CustomListeners.test.log(Status.PASS,"select Ram from drop down");
    }
    public void clickRadioButtonHDD320()
    {
        clickOnElement(clickRadioButtonHDD320);
    }
    public void clickRadioButtonOSVistaHome()
    {
        clickOnElement(clickRadioButtonOSVistaHome);
    }
    public void clickOnCheckBoxSoftwareMicrosoftOffice()
    {
        clickOnElement(clickOnCheckBoxSoftwareMicrosoftOffice);
    }
    public void clickOnAddToChatButton()
    {
        clickOnElement(clickOnAddToChatButton);
    }
    public String getVerifyMessageTheProductHasBeenAddedToYourShoppingCart()
    {
        return getTextFromElement(verifyAddToShoppingCart);
    }

}
