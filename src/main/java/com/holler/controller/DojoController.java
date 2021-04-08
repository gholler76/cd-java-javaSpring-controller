package com.holler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@GetMapping("/{dojo}")
	public String showDojo(@PathVariable("dojo") String dojo){
		return "The dojo is awesome! " + dojo;
	}


}