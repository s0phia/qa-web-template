package com.db.am.bauhaus.project.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends PageObject{

    @FindBy(css = ".float-left>h1")
    WebElementFacade mainHeader;

    @FindBy(css = "div.clearfix.pb-xs-1-5")
    WebElementFacade categoriesHeader;

     public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    public String getMainHeader() {
        return mainHeader.waitUntilPresent().getText();
    }

    public String getTopCategoriesHeader() {
        return categoriesHeader.waitUntilPresent().getText();
    }

}
