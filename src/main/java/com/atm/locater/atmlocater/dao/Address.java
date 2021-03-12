package com.atm.locater.atmlocater.dao;

import java.util.Objects;

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
	
	 @Override
	    public String toString() {
	        return "Address{" +
	                "street='" + street + '\'' +
	                ", housenumber='" + housenumber + '\'' +
	                ", postalcode='" + postalcode + '\'' +
	                ", city='" + city + '\'' +
	                ", geoLocation=" + geoLocation + 
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Address address = (Address) o;
	        return Objects.equals(street, address.street) &&
	                Objects.equals(housenumber, address.housenumber) &&
	                Objects.equals(postalcode, address.postalcode) &&
	                Objects.equals(city, address.city) &&
	                Objects.equals(geoLocation, address.geoLocation);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(street, housenumber, postalcode, city, geoLocation);
	    }

}
