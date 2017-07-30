package com.db.am.bauhaus.project.pages;

import com.db.am.bauhaus.project.SessionVar;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by ongshir on 05/10/2016.
 */
@DefaultUrl("/")
public class MainSearchPage extends PageObject {

    @FindBy(id = "search-query")
    WebElementFacade inputBox;

    @FindBy(css = "button.btn.btn-primary")
    WebElementFacade searchButton;

    public MainSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFromInputBox(String searchText) {
        Serenity.setSessionVariable(SessionVar.SEARCH_TEXT).to(searchText);
        inputBox.waitUntilPresent().sendKeys(searchText);
        searchButton.click();
    }

    public void searchFromDropDownMenu(List<String> menuItemList) {
        String lastMenuItem = menuItemList.get(menuItemList.size() - 1);
        Serenity.setSessionVariable(SessionVar.SEARCH_TEXT).to(lastMenuItem);

        Actions actions = new Actions(getDriver());
        for (int i = 0; i < menuItemList.size() - 1; i++) {
            actions.moveToElement(getDriver().findElement(By.linkText(menuItemList.get(i)))).perform();
        }

        getDriver().findElement(By.linkText(lastMenuItem)).click();
    }

    public void searchFromIcons(String iconName) {
        Serenity.setSessionVariable(SessionVar.SEARCH_TEXT).to(iconName);

        List<WebElement> icons = getDriver().findElements(By.cssSelector("div.block-grid-item.vesta-hp-category-card"));
        for (WebElement icon : icons) {
            if (icon.getText().equals(iconName)) {
                icon.click();
                break;
            }
        }
    }
}
