package org.wecancodeit.albumapp.controllers;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	//@GetMapping("/")
	public String home() {
		return "index";
	}

}
