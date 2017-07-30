package com.db.am.bauhaus.project.model.respsonse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sansong on 30/07/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Result {

    @JsonProperty("listing_id")
    private Integer listingId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("creation_tsz")
    private Integer creationTsz;
    @JsonProperty("ending_tsz")
    private Integer endingTsz;
    @JsonProperty("original_creation_tsz")
    private Integer originalCreationTsz;
    @JsonProperty("last_modified_tsz")
    private Integer lastModifiedTsz;
    @JsonProperty("price")
    private String price;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("category_path")
    private List<String> categoryPath = null;
    @JsonProperty("category_path_ids")
    private List<Integer> categoryPathIds = null;
    @JsonProperty("materials")
    private List<Object> materials = null;
    @JsonProperty("shop_section_id")
    private Object shopSectionId;
    @JsonProperty("featured_rank")
    private Object featuredRank;
    @JsonProperty("state_tsz")
    private Integer stateTsz;
    @JsonProperty("url")
    private String url;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("num_favorers")
    private Integer numFavorers;
    @JsonProperty("shipping_template_id")
    private Object shippingTemplateId;
    @JsonProperty("processing_min")
    private Object processingMin;
    @JsonProperty("processing_max")
    private Object processingMax;
    @JsonProperty("who_made")
    private String whoMade;
    @JsonProperty("is_supply")
    private String isSupply;
    @JsonProperty("when_made")
    private String whenMade;
    @JsonProperty("item_weight")
    private Object itemWeight;
    @JsonProperty("item_weight_units")
    private Object itemWeightUnits;
    @JsonProperty("item_length")
    private Object itemLength;
    @JsonProperty("item_width")
    private Object itemWidth;
    @JsonProperty("item_height")
    private Object itemHeight;
    @JsonProperty("item_dimensions_unit")
    private String itemDimensionsUnit;
    @JsonProperty("is_private")
    private Boolean isPrivate;
    @JsonProperty("recipient")
    private String recipient;
    @JsonProperty("occasion")
    private Object occasion;
    @JsonProperty("style")
    private Object style;
    @JsonProperty("non_taxable")
    private Boolean nonTaxable;
    @JsonProperty("is_customizable")
    private Boolean isCustomizable;
    @JsonProperty("is_digital")
    private Boolean isDigital;
    @JsonProperty("file_data")
    private String fileData;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_variations")
    private Boolean hasVariations;
    @JsonProperty("taxonomy_id")
    private Integer taxonomyId;
    @JsonProperty("taxonomy_path")
    private List<String> taxonomyPath = null;
    @JsonProperty("used_manufacturer")
    private Boolean usedManufacturer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("listing_id")
    public Integer getListingId() {
        return listingId;
    }

    @JsonProperty("listing_id")
    public void setListingId(Integer listingId) {
        this.listingId = listingId;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("creation_tsz")
    public Integer getCreationTsz() {
        return creationTsz;
    }

    @JsonProperty("creation_tsz")
    public void setCreationTsz(Integer creationTsz) {
        this.creationTsz = creationTsz;
    }

    @JsonProperty("ending_tsz")
    public Integer getEndingTsz() {
        return endingTsz;
    }

    @JsonProperty("ending_tsz")
    public void setEndingTsz(Integer endingTsz) {
        this.endingTsz = endingTsz;
    }

    @JsonProperty("original_creation_tsz")
    public Integer getOriginalCreationTsz() {
        return originalCreationTsz;
    }

    @JsonProperty("original_creation_tsz")
    public void setOriginalCreationTsz(Integer originalCreationTsz) {
        this.originalCreationTsz = originalCreationTsz;
    }

    @JsonProperty("last_modified_tsz")
    public Integer getLastModifiedTsz() {
        return lastModifiedTsz;
    }

    @JsonProperty("last_modified_tsz")
    public void setLastModifiedTsz(Integer lastModifiedTsz) {
        this.lastModifiedTsz = lastModifiedTsz;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("category_path")
    public List<String> getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("category_path")
    public void setCategoryPath(List<String> categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("category_path_ids")
    public List<Integer> getCategoryPathIds() {
        return categoryPathIds;
    }

    @JsonProperty("category_path_ids")
    public void setCategoryPathIds(List<Integer> categoryPathIds) {
        this.categoryPathIds = categoryPathIds;
    }

    @JsonProperty("materials")
    public List<Object> getMaterials() {
        return materials;
    }

    @JsonProperty("materials")
    public void setMaterials(List<Object> materials) {
        this.materials = materials;
    }

    @JsonProperty("shop_section_id")
    public Object getShopSectionId() {
        return shopSectionId;
    }

    @JsonProperty("shop_section_id")
    public void setShopSectionId(Object shopSectionId) {
        this.shopSectionId = shopSectionId;
    }

    @JsonProperty("featured_rank")
    public Object getFeaturedRank() {
        return featuredRank;
    }

    @JsonProperty("featured_rank")
    public void setFeaturedRank(Object featuredRank) {
        this.featuredRank = featuredRank;
    }

    @JsonProperty("state_tsz")
    public Integer getStateTsz() {
        return stateTsz;
    }

    @JsonProperty("state_tsz")
    public void setStateTsz(Integer stateTsz) {
        this.stateTsz = stateTsz;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("num_favorers")
    public Integer getNumFavorers() {
        return numFavorers;
    }

    @JsonProperty("num_favorers")
    public void setNumFavorers(Integer numFavorers) {
        this.numFavorers = numFavorers;
    }

    @JsonProperty("shipping_template_id")
    public Object getShippingTemplateId() {
        return shippingTemplateId;
    }

    @JsonProperty("shipping_template_id")
    public void setShippingTemplateId(Object shippingTemplateId) {
        this.shippingTemplateId = shippingTemplateId;
    }

    @JsonProperty("processing_min")
    public Object getProcessingMin() {
        return processingMin;
    }

    @JsonProperty("processing_min")
    public void setProcessingMin(Object processingMin) {
        this.processingMin = processingMin;
    }

    @JsonProperty("processing_max")
    public Object getProcessingMax() {
        return processingMax;
    }

    @JsonProperty("processing_max")
    public void setProcessingMax(Object processingMax) {
        this.processingMax = processingMax;
    }

    @JsonProperty("who_made")
    public String getWhoMade() {
        return whoMade;
    }

    @JsonProperty("who_made")
    public void setWhoMade(String whoMade) {
        this.whoMade = whoMade;
    }

    @JsonProperty("is_supply")
    public String getIsSupply() {
        return isSupply;
    }

    @JsonProperty("is_supply")
    public void setIsSupply(String isSupply) {
        this.isSupply = isSupply;
    }

    @JsonProperty("when_made")
    public String getWhenMade() {
        return whenMade;
    }

    @JsonProperty("when_made")
    public void setWhenMade(String whenMade) {
        this.whenMade = whenMade;
    }

    @JsonProperty("item_weight")
    public Object getItemWeight() {
        return itemWeight;
    }

    @JsonProperty("item_weight")
    public void setItemWeight(Object itemWeight) {
        this.itemWeight = itemWeight;
    }

    @JsonProperty("item_weight_units")
    public Object getItemWeightUnits() {
        return itemWeightUnits;
    }

    @JsonProperty("item_weight_units")
    public void setItemWeightUnits(Object itemWeightUnits) {
        this.itemWeightUnits = itemWeightUnits;
    }

    @JsonProperty("item_length")
    public Object getItemLength() {
        return itemLength;
    }

    @JsonProperty("item_length")
    public void setItemLength(Object itemLength) {
        this.itemLength = itemLength;
    }

    @JsonProperty("item_width")
    public Object getItemWidth() {
        return itemWidth;
    }

    @JsonProperty("item_width")
    public void setItemWidth(Object itemWidth) {
        this.itemWidth = itemWidth;
    }

    @JsonProperty("item_height")
    public Object getItemHeight() {
        return itemHeight;
    }

    @JsonProperty("item_height")
    public void setItemHeight(Object itemHeight) {
        this.itemHeight = itemHeight;
    }

    @JsonProperty("item_dimensions_unit")
    public String getItemDimensionsUnit() {
        return itemDimensionsUnit;
    }

    @JsonProperty("item_dimensions_unit")
    public void setItemDimensionsUnit(String itemDimensionsUnit) {
        this.itemDimensionsUnit = itemDimensionsUnit;
    }

    @JsonProperty("is_private")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("is_private")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("recipient")
    public String getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("occasion")
    public Object getOccasion() {
        return occasion;
    }

    @JsonProperty("occasion")
    public void setOccasion(Object occasion) {
        this.occasion = occasion;
    }

    @JsonProperty("style")
    public Object getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Object style) {
        this.style = style;
    }

    @JsonProperty("non_taxable")
    public Boolean getNonTaxable() {
        return nonTaxable;
    }

    @JsonProperty("non_taxable")
    public void setNonTaxable(Boolean nonTaxable) {
        this.nonTaxable = nonTaxable;
    }

    @JsonProperty("is_customizable")
    public Boolean getIsCustomizable() {
        return isCustomizable;
    }

    @JsonProperty("is_customizable")
    public void setIsCustomizable(Boolean isCustomizable) {
        this.isCustomizable = isCustomizable;
    }

    @JsonProperty("is_digital")
    public Boolean getIsDigital() {
        return isDigital;
    }

    @JsonProperty("is_digital")
    public void setIsDigital(Boolean isDigital) {
        this.isDigital = isDigital;
    }

    @JsonProperty("file_data")
    public String getFileData() {
        return fileData;
    }

    @JsonProperty("file_data")
    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("has_variations")
    public Boolean getHasVariations() {
        return hasVariations;
    }

    @JsonProperty("has_variations")
    public void setHasVariations(Boolean hasVariations) {
        this.hasVariations = hasVariations;
    }

    @JsonProperty("taxonomy_id")
    public Integer getTaxonomyId() {
        return taxonomyId;
    }

    @JsonProperty("taxonomy_id")
    public void setTaxonomyId(Integer taxonomyId) {
        this.taxonomyId = taxonomyId;
    }

    @JsonProperty("taxonomy_path")
    public List<String> getTaxonomyPath() {
        return taxonomyPath;
    }

    @JsonProperty("taxonomy_path")
    public void setTaxonomyPath(List<String> taxonomyPath) {
        this.taxonomyPath = taxonomyPath;
    }

    @JsonProperty("used_manufacturer")
    public Boolean getUsedManufacturer() {
        return usedManufacturer;
    }

    @JsonProperty("used_manufacturer")
    public void setUsedManufacturer(Boolean usedManufacturer) {
        this.usedManufacturer = usedManufacturer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}