package com.db.am.bauhaus.project.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends PageObject{

    @FindBy(css = ".float-left>h1")
    WebElementFacade mainHeader;

    @FindBy(css = "div.clearfix.pb-xs-1-5")
    WebElementFacade categoriesHeader;

    private org.openqa.selenium.By registerLink = By.linkText("Register");
    private org.openqa.selenium.By signInButton = By.id("sign-in");
    private org.openqa.selenium.By personalIcon = By.cssSelector("li.user-nav.has-sub-nav");

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.waitUntilPresent().getText();
    }

    public String getTopCategoriesHeader() {
        return categoriesHeader.waitUntilPresent().getText();
    }

    public boolean isRegisterLinkDisplayed() {
        return getDriver().findElement(registerLink).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        return isElementPresent(signInButton);
    }

    public boolean isPersonalIconDisplayed() {
        return isElementPresent(personalIcon);
    }

    public boolean isElementPresent(org.openqa.selenium.By personalIcon) {
        try {
            getDriver().findElement(personalIcon);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
