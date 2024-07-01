package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class ExternalapicallexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalapicallexApplication.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}*/

}
