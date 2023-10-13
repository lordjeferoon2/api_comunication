package com.hacom.apicomunication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.hacom.apicomunication.entity.Alert;
import com.hacom.apicomunication.service.XmlCapToJsonCap;

public class SendXmlCapController {
	
	@Autowired
	XmlCapToJsonCap xmlCapToAtisService;
	
	@PostMapping(value = "/sendXmlCapToCbegw")
    public ResponseEntity<Alert> sendXmlCapToCbegw(@RequestBody String alertXml) {
        try {
            Alert alert = xmlCapToAtisService.parseXmlToAlert(alertXml);
            RestTemplate restTemplate = new RestTemplate();

    		HttpHeaders headers = new HttpHeaders();
    		headers.setContentType(MediaType.APPLICATION_JSON);

    		HttpEntity<Alert> requestEntity = new HttpEntity<>(alert, headers);

    		String url = "http://localhost:8086/cbe-gw/jsonCapToAtis";
    		restTemplate.postForLocation(url, requestEntity);
    		
    		return ResponseEntity.ok(alert);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Alert());
        }
    }
}
