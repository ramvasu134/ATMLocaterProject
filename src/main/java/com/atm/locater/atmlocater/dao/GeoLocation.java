package com.atm.locater.atmlocater.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class GeoLocation {
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("lng")
	private String lng;
	

}
