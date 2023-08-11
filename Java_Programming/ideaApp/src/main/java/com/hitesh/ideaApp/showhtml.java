package com.hitesh.ideaApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class showhtml {
	
	@RequestMapping(path = "/index")
	public String show() {
		return "index";
	}
}
