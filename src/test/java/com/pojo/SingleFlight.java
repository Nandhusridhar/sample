
package com.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleFlight {
	private int id;
    private String flightName;
    @JsonProperty("Country") 
    private String country;
    public int getId() {
		return id;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getCountry() {
		return country;
	}
	public String getDestinations() {
		return destinations;
	}
	public String getuRL() {
		return uRL;
	}
	public String getCreated_Date() {
		return created_Date;
	}
	public String getUpdated_Date() {
		return updated_Date;
	}
	@JsonProperty("Destinations") 
    private String destinations;
    @JsonProperty("URL") 
    private String uRL;
    @JsonProperty("Created_Date") 
    private String created_Date;
    @JsonProperty("Updated_Date") 
    private String updated_Date;
}
