package com.atm.locater.atmlocater.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OpeningHours {

	@JsonProperty("dayOfWeek")
	private Integer dayOfWeek;
	@JsonProperty("hours")
	private List<AtmHours> hours;

}
