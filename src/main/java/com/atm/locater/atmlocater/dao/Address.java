package com.atm.locater.atmlocater.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Address {
	
	@JsonProperty("geoLocation")
	private GeoLocation geoLocation;
	@JsonProperty("street")
	private String street;
	@JsonProperty("housenumber")
	private String housenumber;
	@JsonProperty("postalcode")
	private String postalcode;
	@JsonProperty("city")
	private String city;

}
