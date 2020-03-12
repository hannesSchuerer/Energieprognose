
package com.spring.forecast.api.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "response", "current_observation" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

	@JsonProperty("response")
	private Response response;
	@JsonProperty("current_observation")
	private CurrentObservation currentObservation;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("response")
	public Response getResponse() {
		return response;
	}

	@JsonProperty("response")
	public void setResponse(Response response) {
		this.response = response;
	}

	@JsonProperty("current_observation")
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	@JsonProperty("current_observation")
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
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
		return new ToStringBuilder(this).append("response", response).append("currentObservation", currentObservation)
				.append("additionalProperties", additionalProperties).toString();
	}

}
