package com.example.ArrayFreeLibrary.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping("/")
	public String sayHi() {
		return "Hi";
		
	}

}
