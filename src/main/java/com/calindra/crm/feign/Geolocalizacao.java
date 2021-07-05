package com.calindra.crm.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(url = "https://maps.googleapis.com/maps/api/geocode/json", name = "geolocalizacao" )
public interface Geolocalizacao {
    @GetMapping
    public EnderecoResponse consulta(@RequestParam("address") String address,
                                     @RequestParam("key") String key);
}
