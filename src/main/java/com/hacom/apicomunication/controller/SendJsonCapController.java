package com.hacom.apicomunication.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hacom.apicomunication.entity.Alert;

@RestController
public class SendJsonCapController {
	
	@PostMapping(value = "/sendJsonCapToCbegw")
	public ResponseEntity<Alert> sendJsonCapToCbegw(@RequestBody Alert alert) {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Alert> requestEntity = new HttpEntity<>(alert, headers);

		String url = "http://localhost:8086/cbe-gw/jsonCapToAtis";
		restTemplate.postForLocation(url, requestEntity);
		
		return ResponseEntity.ok(alert);
	}
	
}
