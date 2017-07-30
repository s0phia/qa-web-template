package com.db.am.bauhaus.project.steplib.api;

import com.db.am.bauhaus.project.SessionVar;
import com.db.am.bauhaus.project.model.respsonse.Listing;
import com.db.am.bauhaus.project.common.Endpoints;
import com.db.am.bauhaus.project.common.HTTPUtil;

import com.jayway.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.http.HttpStatus;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by sansong on 30/07/2017.
 */
public class SearchSteps extends ScenarioSteps {

    @Step
    public void get_listing_id(String id) {
        Serenity.setSessionVariable(SessionVar.LISTING_ID).to(id);
    }

    @Step
    public void search_listing_by_id() {
        Response response = HTTPUtil.get(Endpoints.LISTINGS + Serenity.sessionVariableCalled(SessionVar.LISTING_ID));
        Serenity.setSessionVariable(SessionVar.RESPONSE).to(response);
    }

    @Step
    public void verify_listing() {
        Response response = Serenity.sessionVariableCalled(SessionVar.RESPONSE);
        assertThat(response.statusCode(), is(HttpStatus.SC_OK));
        Listing listing = response.as(Listing.class);
        assertThat(listing.getCount(), is(1));
        assertThat(listing.getResults().get(0).getListingId(),
                is((Integer.valueOf(Serenity.sessionVariableCalled(SessionVar.LISTING_ID)))));
    }

    @Step
    public void verify_listing_not_found_message() {
        Response response = Serenity.sessionVariableCalled(SessionVar.RESPONSE);
        assertThat(response.statusCode(), is(HttpStatus.SC_NOT_FOUND));
        String expectedError = String.format("Listing with PK %s does not exist",
                (String)Serenity.sessionVariableCalled(SessionVar.LISTING_ID));
        assertThat(response.getBody().asString(), equalTo(expectedError));
    }

    @Step
    public void verify_status_and_message(int status, String message) {
        Response response = Serenity.sessionVariableCalled(SessionVar.RESPONSE);
        assertThat(response.statusCode(), is(status));
        assertThat(response.getBody().asString(), equalTo(message));

    }
}
