package com.atm.locater.atmlocater.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AtmHours {
	
	@JsonProperty("hourFrom")
	private String hourFrom;
	@JsonProperty("hourTo")
	private String hourTo;

}
