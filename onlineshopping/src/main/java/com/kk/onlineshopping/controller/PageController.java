package com.kk.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class PageController {
	@RequestMapping( value="/login",method=RequestMethod.GET)
	
	public String index(Model model)
	{
		model.addAttribute("message", "login page");
		return "login";
	}
}