package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement verifyComputerTab;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement verifyDesktopText;

    public void clickOnComputerTab()
    {
        clickOnElement(computersTab);
    }
    public String getVerifyComputerTab()
    {
        return getTextFromElement(verifyComputerTab);
    }

}
