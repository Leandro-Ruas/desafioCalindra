package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//url host que vamos fazer a consulta.
@FeignClient(url = "https://maps.googleapis.com/maps/api/geocode/", name = "endereco" )

public interface Enderecos {

	
	
}




