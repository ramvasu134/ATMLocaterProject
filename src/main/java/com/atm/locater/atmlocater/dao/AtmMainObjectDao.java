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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getFunctionality() {
		return functionality;
	}
	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<OpeningHours> getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(List<OpeningHours> openingHours) {
		this.openingHours = openingHours;
	}
	
	

}
