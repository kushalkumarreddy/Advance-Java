package com.codegnan.SpringMVCDemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/checklogin")
	public String checkLogin(@RequestParam("username")String username,
			@RequestParam("password")String password) {
		if(username.equals("jaya")&&password.equals("jaya123")) {
			return "success.jsp";
		}
		return "failed";
	}
}
