package com.atm.locater.atmlocater.dao;

import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OpeningHours {
	
	private int dayOfWeek;
	private List<AtmHours> atmHoursList;

}
