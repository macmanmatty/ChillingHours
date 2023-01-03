package com.chillinghours.ChillingHours;


import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@ConfigurationPropertiesScan("/")
public class Properties {
  private   String apiKey;
  private  int limit;
  private String noaaBaseUrl="www.noaa.gov";
  private String noaaLocationsUrl;

    public String getApiKey() {
        return apiKey;
    }

    public int getLimit() {
        return limit;
    }

    public String getNoaaBaseUrl() {
        return noaaBaseUrl;
    }

    public String getNoaaLocationsUrl() {
        return noaaLocationsUrl;
    }
}
