package com.atm.locater.atmlocater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atm.locater.atmlocater.controller.service.AtmLocaterService;
import com.atm.locater.atmlocater.dao.AtmMainObjectDao;

@RestController
@RequestMapping(path = "/atmlocator")
public class ATMLocatorRestController {
	@Autowired
	private AtmLocaterService atmLocatorService; 
	
	@GetMapping(path = "/atm", name = "", produces = "application/json")
	public List<AtmMainObjectDao> getAtms() throws Exception{
		return atmLocatorService.getAtmLocations();
    }

}
