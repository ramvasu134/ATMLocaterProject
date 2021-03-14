package com.atm.locater.atmlocater.resttemplate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.atm.locater.atmlocater.dao.AtmMainObjectDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component
@Data
@Slf4j
public class AtmLocaterRestTemplate {

	@Autowired
	private RestTemplate restTemplate;

	List<AtmMainObjectDao> atmMainObjectDaos = new ArrayList<AtmMainObjectDao>();

	public List<AtmMainObjectDao> getAtmLocationsFromRestTemplate(String city) throws Exception {

		String response = restTemplate.getForObject("https://www.ing.nl/api/locator/atms/", String.class);
		String toBeParsed = response.substring(6, response.length());
		ObjectMapper objectMapper = new ObjectMapper();
		AtmMainObjectDao[] mainObjectDaos = objectMapper.readValue(toBeParsed, AtmMainObjectDao[].class);
		atmMainObjectDaos = Arrays.asList(mainObjectDaos);
		if (city == null) {
			return atmMainObjectDaos;
		} else {
			atmMainObjectDaos = atmMainObjectDaos.stream()
					.filter(atmAdresObj -> city.equalsIgnoreCase(atmAdresObj.getAddress().getCity()))
					.collect(Collectors.toList());
		}

		return atmMainObjectDaos;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMillis(3000)).setReadTimeout(Duration.ofMillis(3000)).build();
	}

}
