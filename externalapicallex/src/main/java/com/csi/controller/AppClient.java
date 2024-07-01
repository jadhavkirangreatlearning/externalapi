package com.csi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "APP", url = "https://jsonmock.hackerrank.com/api/countries?name=India")
public interface AppClient {

    @GetMapping
    public String getCountryInfo();
}
