package com.atm.locater.atmlocater.dao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Address {
	
	private String street;
	private String housenumber;
	private String postalcode;
	private String city;

}
