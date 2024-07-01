package com.csi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    /*@Autowired
    RestTemplate restTemplate;*/

    @Autowired
    private AppClient appClient;


    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER");
    }

    /*@GetMapping("/countryinfo")
    public ResponseEntity<String> getCountryInfo() {
        return ResponseEntity.ok(restTemplate.getForObject("https://jsonmock.hackerrank.com/api/countries?name=India", String.class));
    }*/

    @GetMapping("/countryinformation")
    public ResponseEntity<String> getCountryInformation(){
        return ResponseEntity.ok(appClient.getCountryInfo());
    }
}
