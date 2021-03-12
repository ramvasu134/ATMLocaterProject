package com.atm.locater.atmlocater.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AtmMainObjectDao {

	@JsonProperty("address")
	private Address address;
	@JsonProperty("distance")
	private String distance;
	@JsonProperty("functionality")
	private String functionality;
	@JsonProperty("type")
	private String type;
	@JsonProperty("openingHours")
	private List<OpeningHours> openingHours;

}
