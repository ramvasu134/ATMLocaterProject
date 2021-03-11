package com.atm.locater.atmlocater.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<AtmMainObjectDao> getAtms() {
		ResponseEntity<AtmMainObjectDao> responseEntity = null;
		System.out.println(")))))))))))");
		
		
		return atmLocatorService.getAtmLocations();
    }

}
