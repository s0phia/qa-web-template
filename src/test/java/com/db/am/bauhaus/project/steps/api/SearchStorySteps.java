package com.db.am.bauhaus.project.steps.api;

import com.db.am.bauhaus.project.steplib.api.SearchSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

/**
 * Created by sansong on 30/07/2017.
 */
public class SearchStorySteps {

    private static final String LISTING_ID_EXISTS = "207977775";
    private static final String LISTING_ID_NOT_EXISTS = "0";

    @Steps
    SearchSteps searchSteps;

    @Given("^an existing listing$")
    public void a_listing_id_exists() {
        searchSteps.get_listing_id(LISTING_ID_EXISTS);
    }

    @Given("^a non-existing listing$")
    public void a_listing_id_does_not_exist() {
        searchSteps.get_listing_id(LISTING_ID_NOT_EXISTS);
    }

    @Given("^an invalid listing Id: (.*)$")
    public void an_invalid_listing_id(String id) {
        searchSteps.get_listing_id(id);
    }

    @When("^a request is made to search for the listing by Id$")
    public void a_request_is_made_to_search_for_the_listing_by_id(){
        searchSteps.search_listing_by_id();
    }

    @Then("^the listing details are returned$")
    public void the_listing_details_are_returned() {
        searchSteps.verify_listing();
    }

    @Then("^a listing not found message is returned$")
    public void verify_listing_not_found_message(){
        searchSteps.verify_listing_not_found_message();
    }

    @Then("^an unsuccessful response is returned with status (.*) and message (.*)$")
    public void unsuccessful_response_with_status_and_message(int status, String message) {
        searchSteps.verify_status_and_message(status, message);
    }
}
