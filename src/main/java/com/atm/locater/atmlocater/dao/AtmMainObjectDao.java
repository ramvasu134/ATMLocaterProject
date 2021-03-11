package com.atm.locater.atmlocater.dao;

import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AtmMainObjectDao {

	
	private Address address;
	private List<OpeningHours> openingHoursList;
	private String distance;
	private String functionality;
	private String type;
}
