package com.db.am.bauhaus.project.model.respsonse;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sansong on 30/07/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Params {

    @JsonProperty("listing_id")
    private String listingId;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("listing_id")
    public String getListingId() {
        return listingId;
    }

    @JsonProperty("listing_id")
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}