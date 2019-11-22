package com.upe.alide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = {"/", "alide", "/index", "index.html"}, method = RequestMethod.GET)
	public String index() {
		
		return "../static/index.html";
	}
	
}
