package com.atm.locater.atmlocater.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.locater.atmlocater.dao.AtmMainObjectDao;
import com.atm.locater.atmlocater.resttemplate.AtmLocaterRestTemplate;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Service
public class AtmLocaterService {

	@Autowired
	private AtmLocaterRestTemplate atmLocaterRestTemp;

	public List<AtmMainObjectDao> getAtmLocations() throws Exception {
		return atmLocaterRestTemp.getAtmLocationsFromRestTemplate();
	}

}
