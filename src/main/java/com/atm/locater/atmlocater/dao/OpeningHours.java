package com.atm.locater.atmlocater.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OpeningHours {

	@JsonProperty("dayOfWeek")
	private int dayOfWeek;
	@JsonIgnore
	private Map<String, Object> atmHoursList = new HashMap<String, Object>();
	@JsonProperty("hours")
	private AtmHours hours;

	@Override
	public String toString() {
		return "OpeningHours{" + "dayOfWeek='" + dayOfWeek + '\'' + ", hours='" + atmHoursList + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		OpeningHours openingHours = (OpeningHours) o;
		return Objects.equals(dayOfWeek, openingHours.dayOfWeek)
				&& Objects.equals(atmHoursList, openingHours.atmHoursList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayOfWeek, atmHoursList);
	}

}
