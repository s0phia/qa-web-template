package com.db.am.bauhaus.project.steps.ui;

import com.db.am.bauhaus.project.SearchFor;
import com.db.am.bauhaus.project.SearchTarget;
import com.db.am.bauhaus.project.SessionVar;
import com.db.am.bauhaus.project.pages.MainSearchPage;
import com.db.am.bauhaus.project.steplib.ui.SearchSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import java.util.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SearchStorySteps {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Steps
    SearchSteps searchSteps;

    MainSearchPage mainSearchPage;

    @Given("^(John|he) is viewing the Etsy landing page$")
    public void goto_landing_page(String theUser) {
        mainSearchPage.open();
    }

    @Given("^([^\\s]+) is viewing the Etsy landing page \\(screenplay\\)$")
    public void goto_landing_page_screenplay(String theUser) {
        theActorCalled(theUser).attemptsTo(Open.browserOn().the(mainSearchPage));
    }
    @When("^he searches for a product from the input box$")
    public void search_from_input_box() {
        searchSteps.search_from_input_box();
    }

    @When("^he searches for a product: '(.*)' from the drop-down menu$")
    public void search_from_drop_down(String menuItems) {
        List<String> menuItemList = Arrays.asList(menuItems.split("/"));
        searchSteps.search_from_drop_down_menu(menuItemList);
    }
    @When("^he searches for a product '(.*)' from the icons$")
    public void search_from_icons(String iconName) {
        searchSteps.search_from_icons(iconName);
    }

    @When("^he searches for a product from the input box \\(screenplay\\)$")
    public void search_from_input_box_screenplay() {
        theActorInTheSpotlight().attemptsTo(SearchFor.randomText());
    }

    @Then("^the result should be displayed$")
    public void verify_search_result() {
        searchSteps.verify_result_for_top_categories();
    }
    @Then("^the result should be displayed on page with header$")
    public void verify_search_result_on_page() {
        searchSteps.verify_result_for_all_categories();
    }

    @Then("^the result should be displayed \\(screenplay\\)$")
    public void verify_search_result_screenplay() {
        String searchText = Serenity.sessionVariableCalled(SessionVar.SEARCH_TEXT).toString();
        theActorInTheSpotlight().should(
                seeThat("the top categories header ", the(SearchTarget.TOP_CATEGORIES_HEADER), containsText(searchText)),
                seeThat("the all categories header ", the(SearchTarget.ALL_CATEGORIES_HEADER), containsText(searchText))
        );
    }


}
