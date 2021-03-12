package com.atm.locater.atmlocater.resttemplate;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.atm.locater.atmlocater.dao.AtmMainObjectDao;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AtmLocaterRestTemplate {

	@Autowired
	private RestTemplate restTemplate;

	public List<AtmMainObjectDao> getAtmLocationsFromRestTemplate() throws Exception{

		String response = restTemplate.getForObject("https://www.ing.nl/api/locator/atms/", String.class);
        String toBeParsed = response.substring(6, response.length());
        ObjectMapper objectMapper = new ObjectMapper();
        AtmMainObjectDao[] mainObjectDaos = objectMapper.readValue(toBeParsed, AtmMainObjectDao[].class);
        return Arrays.asList(mainObjectDaos);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMillis(3000)).setReadTimeout(Duration.ofMillis(3000)).build();
	}
}
