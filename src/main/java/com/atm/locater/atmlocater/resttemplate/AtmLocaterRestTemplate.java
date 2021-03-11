package com.atm.locater.atmlocater.resttemplate;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.atm.locater.atmlocater.dao.AtmMainObjectDao;

public class AtmLocaterRestTemplate {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<AtmMainObjectDao> getAtmLocationsFromRestTemplate(){
ResponseEntity<AtmMainObjectDao> responseEntity = null;

AtmMainObjectDao atmMainObjectDao = restTemplate.getForObject("https://www.ing.nl/api/locator/atms/", AtmMainObjectDao.class);
System.out.println(" +++++++++ "+atmMainObjectDao);
//responseEntity = (ResponseEntity<AtmMainObjectDao>)restTemplate.exchange("https://www.ing.nl/api/locator/atms/", HttpMethod.GET, responseEntity, null, null)	;	

		return responseEntity;
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	 
	    return builder
	            .setConnectTimeout(Duration.ofMillis(3000))
	            .setReadTimeout(Duration.ofMillis(3000))
	            .build();
	}
}
