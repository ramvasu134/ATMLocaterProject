package com.atm.locater.atmlocater.controller.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.atm.locater.atmlocater.dao.AtmMainObjectDao;
import com.atm.locater.atmlocater.resttemplate.AtmLocaterRestTemplate;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Service
public class AtmLocaterService {
	
	private AtmLocaterRestTemplate atmLocaterRestTemp;
	
	public ResponseEntity<AtmMainObjectDao> getAtmLocations(){
		ResponseEntity<AtmMainObjectDao> responseEntity = null;
		
		return atmLocaterRestTemp.getAtmLocationsFromRestTemplate();
		
	}

}
