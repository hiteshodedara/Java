package com.hitesh.ideaApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class showhtml {
	
	@GetMapping(path = "/index")
	public String hello() {
		return ("Hello");
}}
