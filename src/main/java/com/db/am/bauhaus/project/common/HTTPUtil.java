package com.db.am.bauhaus.project.common;

import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static net.serenitybdd.rest.RestRequests.given;

/**
 * Created by sansong on 30/07/2017.
 */
public class HTTPUtil extends ScenarioSteps{

    //TODO: Externalise
    private static final String API_KEY = "qfek1thkp4o8oev3elt4von9";
    private static final String BASE_URI = "https://openapi.etsy.com/v2";

    @Step
    public static Response get(String path) {

        Response response = given()
                .baseUri(BASE_URI)
                .queryParam("api_key", API_KEY)
                .urlEncodingEnabled(false)
                .filter(RequestLoggingFilter.logRequestTo(System.out))
                .filter(ResponseLoggingFilter.logResponseTo(System.out))
                .when()
                .get(path);

        return response;

    }
}

