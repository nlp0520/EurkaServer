package com.example.Userprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/alive")
	public String alive(){
		return "ok";
	}
}
