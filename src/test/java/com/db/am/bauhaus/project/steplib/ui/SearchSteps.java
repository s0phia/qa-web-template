package com.db.am.bauhaus.project.steplib.ui;

import com.db.am.bauhaus.project.SessionVar;
import com.db.am.bauhaus.project.pages.MainSearchPage;
import com.db.am.bauhaus.project.pages.AdvancedSearchPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SearchSteps extends ScenarioSteps {

    MainSearchPage mainSearchPage;
    AdvancedSearchPage AdvancedSearchPage;
    String searchText;

    @Step
    public void search_from_input_box() {
        mainSearchPage.searchFromInputBox("crafts");
    }

    @Step
    public void search_from_drop_down_menu(List<String> menuItemList) {
        mainSearchPage.searchFromDropDownMenu(menuItemList);
    }

    @Step
    public void search_from_icons(String iconName) {
        mainSearchPage.searchFromIcons(iconName);
    }

    @Step
    public void verify_result_for_top_categories() {
        searchText = Serenity.sessionVariableCalled(SessionVar.SEARCH_TEXT).toString();
        assertThat(AdvancedSearchPage.getTopCategoriesHeader(), containsString(searchText));
    }

    @Step
    public void verify_result_for_all_categories() {
        searchText = Serenity.sessionVariableCalled(SessionVar.SEARCH_TEXT).toString();
        assertThat(AdvancedSearchPage.getMainHeader(), containsString(searchText));
    }

    @Step
    public void verify_registration_link_displayed(boolean flag) {
        assertThat(AdvancedSearchPage.isRegisterLinkDisplayed(), is(flag));
    }

    @Step
    public void verify_sign_in_button_displayed(boolean flag) {
        assertThat(AdvancedSearchPage.isSignInButtonDisplayed(), is(flag));
    }

    @Step
    public void verify_personalised_icon_displayed(boolean flag) {
        assertThat(AdvancedSearchPage.isPersonalIconDisplayed(), is(flag));
    }
}
