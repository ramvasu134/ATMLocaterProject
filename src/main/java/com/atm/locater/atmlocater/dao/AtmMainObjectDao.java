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
public class AtmMainObjectDao {

	
	@JsonProperty("address")
	private Address address;
	 
	 @JsonIgnore
	    private Map<String, Object> openingHoursList = new HashMap<String, Object>();
	@JsonProperty("distance")
	private String distance;
	@JsonProperty("functionality")
	private String functionality;
	@JsonProperty("type")
	private String type;
	 @JsonIgnore
	@JsonProperty("OpeningHours")
	private String openingHours;
	
	@Override
    public String toString() {
        return "AtmMainObjectDao{" +
                "address=" + address +
                ", distance=" + distance +
                ", openingHours=" + openingHoursList +
                  ", functionality=" + functionality +
                 ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtmMainObjectDao mainObjectDao = (AtmMainObjectDao) o;
        return Objects.equals(address, mainObjectDao.address) &&
                Objects.equals(distance, mainObjectDao.distance) &&
                Objects.equals(functionality, mainObjectDao.functionality) &&
                Objects.equals(type, mainObjectDao.type) &&
                Objects.equals(openingHoursList, openingHoursList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, distance, type, openingHoursList);
    }
}
