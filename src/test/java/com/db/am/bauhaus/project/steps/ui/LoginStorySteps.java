package com.db.am.bauhaus.project.steps.ui;

import com.db.am.bauhaus.project.steplib.ui.SearchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sansong on 30/07/2017.
 */
public class LoginStorySteps {

    @Steps
    SearchSteps searchSteps;

    @Given("^John is not logged in$")
    public void john_is_not_authenticated() throws Throwable {
        //Do not authenticate
    }

    @Then("^the registration link is displayed$")
    public void the_registration_link_is_displayed() {
        searchSteps.verify_registration_link_displayed(true);
    }

    @Then("^the sign in button is displayed$")
    public void the_sign_in_button_is_displayed() {
        searchSteps.verify_sign_in_button_displayed(true);
    }
    @Then("^the personalised icon is not displayed$")
    public void the_personalised_icon_is_not_displayed() {
        searchSteps.verify_personalised_icon_displayed(false);
    }
}
