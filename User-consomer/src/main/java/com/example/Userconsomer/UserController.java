package com.example.Userconsomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class UserController {
	
	@Autowired
	UserAPI api;
	
	@GetMapping("/alive")
	public String alive() {
		return api.alive();
	}
}
