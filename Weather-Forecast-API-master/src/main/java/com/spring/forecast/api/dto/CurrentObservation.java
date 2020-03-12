
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
@JsonPropertyOrder({ "image", "display_location", "observation_location", "estimated", "station_id", "observation_time",
		"observation_time_rfc822", "observation_epoch", "local_time_rfc822", "local_epoch", "local_tz_short",
		"local_tz_long", "local_tz_offset", "weather", "temperature_string", "temp_f", "temp_c", "relative_humidity",
		"wind_string", "wind_dir", "wind_degrees", "wind_mph", "wind_gust_mph", "wind_kph", "wind_gust_kph",
		"pressure_mb", "pressure_in", "pressure_trend", "dewpoint_string", "dewpoint_f", "dewpoint_c",
		"heat_index_string", "heat_index_f", "heat_index_c", "windchill_string", "windchill_f", "windchill_c",
		"feelslike_string", "feelslike_f", "feelslike_c", "visibility_mi", "visibility_km", "solarradiation", "UV",
		"precip_1hr_string", "precip_1hr_in", "precip_1hr_metric", "precip_today_string", "precip_today_in",
		"precip_today_metric", "icon", "icon_url", "forecast_url", "history_url", "ob_url", "nowcast" })
public class CurrentObservation {

	@JsonProperty("image")
	private Image image;
	@JsonProperty("display_location")
	private DisplayLocation displayLocation;
	@JsonProperty("observation_location")
	private ObservationLocation observationLocation;
	@JsonProperty("estimated")
	private Estimated estimated;
	@JsonProperty("station_id")
	private String stationId;
	@JsonProperty("observation_time")
	private String observationTime;
	@JsonProperty("observation_time_rfc822")
	private String observationTimeRfc822;
	@JsonProperty("observation_epoch")
	private String observationEpoch;
	@JsonProperty("local_time_rfc822")
	private String localTimeRfc822;
	@JsonProperty("local_epoch")
	private String localEpoch;
	@JsonProperty("local_tz_short")
	private String localTzShort;
	@JsonProperty("local_tz_long")
	private String localTzLong;
	@JsonProperty("local_tz_offset")
	private String localTzOffset;
	@JsonProperty("weather")
	private String weather;
	@JsonProperty("temperature_string")
	private String temperatureString;
	@JsonProperty("temp_f")
	private Integer tempF;
	@JsonProperty("temp_c")
	private Integer tempC;
	@JsonProperty("relative_humidity")
	private String relativeHumidity;
	@JsonProperty("wind_string")
	private String windString;
	@JsonProperty("wind_dir")
	private String windDir;
	@JsonProperty("wind_degrees")
	private Integer windDegrees;
	@JsonProperty("wind_mph")
	private Integer windMph;
	@JsonProperty("wind_gust_mph")
	private Object windGustMph;
	@JsonProperty("wind_kph")
	private Object windKph;
	@JsonProperty("wind_gust_kph")
	private Object windGustKph;
	@JsonProperty("pressure_mb")
	private String pressureMb;
	@JsonProperty("pressure_in")
	private String pressureIn;
	@JsonProperty("pressure_trend")
	private String pressureTrend;
	@JsonProperty("dewpoint_string")
	private String dewpointString;
	@JsonProperty("dewpoint_f")
	private Integer dewpointF;
	@JsonProperty("dewpoint_c")
	private Integer dewpointC;
	@JsonProperty("heat_index_string")
	private String heatIndexString;
	@JsonProperty("heat_index_f")
	private String heatIndexF;
	@JsonProperty("heat_index_c")
	private String heatIndexC;
	@JsonProperty("windchill_string")
	private String windchillString;
	@JsonProperty("windchill_f")
	private String windchillF;
	@JsonProperty("windchill_c")
	private String windchillC;
	@JsonProperty("feelslike_string")
	private String feelslikeString;
	@JsonProperty("feelslike_f")
	private String feelslikeF;
	@JsonProperty("feelslike_c")
	private String feelslikeC;
	@JsonProperty("visibility_mi")
	private String visibilityMi;
	@JsonProperty("visibility_km")
	private String visibilityKm;
	@JsonProperty("solarradiation")
	private String solarradiation;
	@JsonProperty("UV")
	private String uV;
	@JsonProperty("precip_1hr_string")
	private String precip1hrString;
	@JsonProperty("precip_1hr_in")
	private String precip1hrIn;
	@JsonProperty("precip_1hr_metric")
	private String precip1hrMetric;
	@JsonProperty("precip_today_string")
	private String precipTodayString;
	@JsonProperty("precip_today_in")
	private String precipTodayIn;
	@JsonProperty("precip_today_metric")
	private String precipTodayMetric;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("icon_url")
	private String iconUrl;
	@JsonProperty("forecast_url")
	private String forecastUrl;
	@JsonProperty("history_url")
	private String historyUrl;
	@JsonProperty("ob_url")
	private String obUrl;
	@JsonProperty("nowcast")
	private String nowcast;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("image")
	public Image getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(Image image) {
		this.image = image;
	}

	@JsonProperty("display_location")
	public DisplayLocation getDisplayLocation() {
		return displayLocation;
	}

	@JsonProperty("display_location")
	public void setDisplayLocation(DisplayLocation displayLocation) {
		this.displayLocation = displayLocation;
	}

	@JsonProperty("observation_location")
	public ObservationLocation getObservationLocation() {
		return observationLocation;
	}

	@JsonProperty("observation_location")
	public void setObservationLocation(ObservationLocation observationLocation) {
		this.observationLocation = observationLocation;
	}

	@JsonProperty("estimated")
	public Estimated getEstimated() {
		return estimated;
	}

	@JsonProperty("estimated")
	public void setEstimated(Estimated estimated) {
		this.estimated = estimated;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getObservationTime() {
		return observationTime;
	}

	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}

	public String getObservationTimeRfc822() {
		return observationTimeRfc822;
	}

	public void setObservationTimeRfc822(String observationTimeRfc822) {
		this.observationTimeRfc822 = observationTimeRfc822;
	}

	public String getObservationEpoch() {
		return observationEpoch;
	}

	public void setObservationEpoch(String observationEpoch) {
		this.observationEpoch = observationEpoch;
	}

	public String getLocalTimeRfc822() {
		return localTimeRfc822;
	}

	public void setLocalTimeRfc822(String localTimeRfc822) {
		this.localTimeRfc822 = localTimeRfc822;
	}

	public String getLocalEpoch() {
		return localEpoch;
	}

	public void setLocalEpoch(String localEpoch) {
		this.localEpoch = localEpoch;
	}

	public String getLocalTzShort() {
		return localTzShort;
	}

	public void setLocalTzShort(String localTzShort) {
		this.localTzShort = localTzShort;
	}

	public String getLocalTzLong() {
		return localTzLong;
	}

	public void setLocalTzLong(String localTzLong) {
		this.localTzLong = localTzLong;
	}

	public String getLocalTzOffset() {
		return localTzOffset;
	}

	public void setLocalTzOffset(String localTzOffset) {
		this.localTzOffset = localTzOffset;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTemperatureString() {
		return temperatureString;
	}

	public void setTemperatureString(String temperatureString) {
		this.temperatureString = temperatureString;
	}

	public Integer getTempF() {
		return tempF;
	}

	public void setTempF(Integer tempF) {
		this.tempF = tempF;
	}

	public Integer getTempC() {
		return tempC;
	}

	public void setTempC(Integer tempC) {
		this.tempC = tempC;
	}

	public String getRelativeHumidity() {
		return relativeHumidity;
	}

	public void setRelativeHumidity(String relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}

	public String getWindString() {
		return windString;
	}

	public void setWindString(String windString) {
		this.windString = windString;
	}

	public String getWindDir() {
		return windDir;
	}

	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}

	public Integer getWindDegrees() {
		return windDegrees;
	}

	public void setWindDegrees(Integer windDegrees) {
		this.windDegrees = windDegrees;
	}

	public Integer getWindMph() {
		return windMph;
	}

	public void setWindMph(Integer windMph) {
		this.windMph = windMph;
	}

	public Object getWindGustMph() {
		return windGustMph;
	}

	public void setWindGustMph(Object windGustMph) {
		this.windGustMph = windGustMph;
	}

	public Object getWindKph() {
		return windKph;
	}

	public void setWindKph(Object windKph) {
		this.windKph = windKph;
	}

	public Object getWindGustKph() {
		return windGustKph;
	}

	public void setWindGustKph(Object windGustKph) {
		this.windGustKph = windGustKph;
	}

	public String getPressureMb() {
		return pressureMb;
	}

	public void setPressureMb(String pressureMb) {
		this.pressureMb = pressureMb;
	}

	public String getPressureIn() {
		return pressureIn;
	}

	public void setPressureIn(String pressureIn) {
		this.pressureIn = pressureIn;
	}

	public String getPressureTrend() {
		return pressureTrend;
	}

	public void setPressureTrend(String pressureTrend) {
		this.pressureTrend = pressureTrend;
	}

	public String getDewpointString() {
		return dewpointString;
	}

	public void setDewpointString(String dewpointString) {
		this.dewpointString = dewpointString;
	}

	public Integer getDewpointF() {
		return dewpointF;
	}

	public void setDewpointF(Integer dewpointF) {
		this.dewpointF = dewpointF;
	}

	public Integer getDewpointC() {
		return dewpointC;
	}

	public void setDewpointC(Integer dewpointC) {
		this.dewpointC = dewpointC;
	}

	public String getHeatIndexString() {
		return heatIndexString;
	}

	public void setHeatIndexString(String heatIndexString) {
		this.heatIndexString = heatIndexString;
	}

	public String getHeatIndexF() {
		return heatIndexF;
	}

	public void setHeatIndexF(String heatIndexF) {
		this.heatIndexF = heatIndexF;
	}

	public String getHeatIndexC() {
		return heatIndexC;
	}

	public void setHeatIndexC(String heatIndexC) {
		this.heatIndexC = heatIndexC;
	}

	public String getWindchillString() {
		return windchillString;
	}

	public void setWindchillString(String windchillString) {
		this.windchillString = windchillString;
	}

	public String getWindchillF() {
		return windchillF;
	}

	public void setWindchillF(String windchillF) {
		this.windchillF = windchillF;
	}

	public String getWindchillC() {
		return windchillC;
	}

	public void setWindchillC(String windchillC) {
		this.windchillC = windchillC;
	}

	public String getFeelslikeString() {
		return feelslikeString;
	}

	public void setFeelslikeString(String feelslikeString) {
		this.feelslikeString = feelslikeString;
	}

	public String getFeelslikeF() {
		return feelslikeF;
	}

	public void setFeelslikeF(String feelslikeF) {
		this.feelslikeF = feelslikeF;
	}

	public String getFeelslikeC() {
		return feelslikeC;
	}

	public void setFeelslikeC(String feelslikeC) {
		this.feelslikeC = feelslikeC;
	}

	public String getVisibilityMi() {
		return visibilityMi;
	}

	public void setVisibilityMi(String visibilityMi) {
		this.visibilityMi = visibilityMi;
	}

	public String getVisibilityKm() {
		return visibilityKm;
	}

	public void setVisibilityKm(String visibilityKm) {
		this.visibilityKm = visibilityKm;
	}

	public String getSolarradiation() {
		return solarradiation;
	}

	public void setSolarradiation(String solarradiation) {
		this.solarradiation = solarradiation;
	}

	public String getuV() {
		return uV;
	}

	public void setuV(String uV) {
		this.uV = uV;
	}

	public String getPrecip1hrString() {
		return precip1hrString;
	}

	public void setPrecip1hrString(String precip1hrString) {
		this.precip1hrString = precip1hrString;
	}

	public String getPrecip1hrIn() {
		return precip1hrIn;
	}

	public void setPrecip1hrIn(String precip1hrIn) {
		this.precip1hrIn = precip1hrIn;
	}

	public String getPrecip1hrMetric() {
		return precip1hrMetric;
	}

	public void setPrecip1hrMetric(String precip1hrMetric) {
		this.precip1hrMetric = precip1hrMetric;
	}

	public String getPrecipTodayString() {
		return precipTodayString;
	}

	public void setPrecipTodayString(String precipTodayString) {
		this.precipTodayString = precipTodayString;
	}

	public String getPrecipTodayIn() {
		return precipTodayIn;
	}

	public void setPrecipTodayIn(String precipTodayIn) {
		this.precipTodayIn = precipTodayIn;
	}

	public String getPrecipTodayMetric() {
		return precipTodayMetric;
	}

	public void setPrecipTodayMetric(String precipTodayMetric) {
		this.precipTodayMetric = precipTodayMetric;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getForecastUrl() {
		return forecastUrl;
	}

	public void setForecastUrl(String forecastUrl) {
		this.forecastUrl = forecastUrl;
	}

	public String getHistoryUrl() {
		return historyUrl;
	}

	public void setHistoryUrl(String historyUrl) {
		this.historyUrl = historyUrl;
	}

	public String getObUrl() {
		return obUrl;
	}

	public void setObUrl(String obUrl) {
		this.obUrl = obUrl;
	}

	public String getNowcast() {
		return nowcast;
	}

	public void setNowcast(String nowcast) {
		this.nowcast = nowcast;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
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
		return new ToStringBuilder(this).append("image", image).append("displayLocation", displayLocation)
				.append("observationLocation", observationLocation).append("estimated", estimated)
				.append("stationId", stationId).append("observationTime", observationTime)
				.append("observationTimeRfc822", observationTimeRfc822).append("observationEpoch", observationEpoch)
				.append("localTimeRfc822", localTimeRfc822).append("localEpoch", localEpoch)
				.append("localTzShort", localTzShort).append("localTzLong", localTzLong)
				.append("localTzOffset", localTzOffset).append("weather", weather)
				.append("temperatureString", temperatureString).append("tempF", tempF).append("tempC", tempC)
				.append("relativeHumidity", relativeHumidity).append("windString", windString)
				.append("windDir", windDir).append("windDegrees", windDegrees).append("windMph", windMph)
				.append("windGustMph", windGustMph).append("windKph", windKph).append("windGustKph", windGustKph)
				.append("pressureMb", pressureMb).append("pressureIn", pressureIn)
				.append("pressureTrend", pressureTrend).append("dewpointString", dewpointString)
				.append("dewpointF", dewpointF).append("dewpointC", dewpointC)
				.append("heatIndexString", heatIndexString).append("heatIndexF", heatIndexF)
				.append("heatIndexC", heatIndexC).append("windchillString", windchillString)
				.append("windchillF", windchillF).append("windchillC", windchillC)
				.append("feelslikeString", feelslikeString).append("feelslikeF", feelslikeF)
				.append("feelslikeC", feelslikeC).append("visibilityMi", visibilityMi)
				.append("visibilityKm", visibilityKm).append("solarradiation", solarradiation).append("uV", uV)
				.append("precip1hrString", precip1hrString).append("precip1hrIn", precip1hrIn)
				.append("precip1hrMetric", precip1hrMetric).append("precipTodayString", precipTodayString)
				.append("precipTodayIn", precipTodayIn).append("precipTodayMetric", precipTodayMetric)
				.append("icon", icon).append("iconUrl", iconUrl).append("forecastUrl", forecastUrl)
				.append("historyUrl", historyUrl).append("obUrl", obUrl).append("nowcast", nowcast)
				.append("additionalProperties", additionalProperties).toString();
	}

}
