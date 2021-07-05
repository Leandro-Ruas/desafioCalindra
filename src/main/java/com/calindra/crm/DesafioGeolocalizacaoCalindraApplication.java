package com.calindra.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioGeolocalizacaoCalindraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioGeolocalizacaoCalindraApplication.class, args);
	}

}
