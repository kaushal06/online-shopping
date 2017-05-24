package com.kk.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class PageController {
	@RequestMapping( value="/login",method=RequestMethod.GET)
	
	public String index(@RequestParam( value="username",required=false) String username,@RequestParam(value="password",required=false) String password ,Model model)
	{
		 if(username ==null && password==null)
		 {
			 model.addAttribute("message","default user log in" );
		 }
		 else
		 {
			 model.addAttribute("message",username+": "+ password +"log in on the login page" );
		 }
		
		return "login";
	}
}