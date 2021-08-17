package com.example.Userconsomer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "XXXX",url = "http://localhost:91")
public interface UserAPI {

	@GetMapping("/alive")
	public String alive();
}
