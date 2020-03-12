
package com.spring.forecast.api.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "full",
    "city",
    "state",
    "state_name",
    "country",
    "country_iso3166",
    "zip",
    "magic",
    "wmo",
    "latitude",
    "longitude",
    "elevation"
})
public class DisplayLocation {

    @JsonProperty("full")
    private String full;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso3166")
    private String countryIso3166;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("magic")
    private String magic;
    @JsonProperty("wmo")
    private String wmo;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("elevation")
    private String elevation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_iso3166")
    public String getCountryIso3166() {
        return countryIso3166;
    }

    @JsonProperty("country_iso3166")
    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("magic")
    public String getMagic() {
        return magic;
    }

    @JsonProperty("magic")
    public void setMagic(String magic) {
        this.magic = magic;
    }

    @JsonProperty("wmo")
    public String getWmo() {
        return wmo;
    }

    @JsonProperty("wmo")
    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("elevation")
    public String getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("full", full).append("city", city).append("state", state).append("stateName", stateName).append("country", country).append("countryIso3166", countryIso3166).append("zip", zip).append("magic", magic).append("wmo", wmo).append("latitude", latitude).append("longitude", longitude).append("elevation", elevation).append("additionalProperties", additionalProperties).toString();
    }

}
