
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
    "version",
    "termsofService",
    "features"
})
public class Response {

    @JsonProperty("version")
    private String version;
    @JsonProperty("termsofService")
    private String termsofService;
    @JsonProperty("features")
    private Features features;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("termsofService")
    public String getTermsofService() {
        return termsofService;
    }

    @JsonProperty("termsofService")
    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
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
        return new ToStringBuilder(this).append("version", version).append("termsofService", termsofService).append("features", features).append("additionalProperties", additionalProperties).toString();
    }

}
