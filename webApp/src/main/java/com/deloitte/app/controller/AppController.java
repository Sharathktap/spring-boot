package com.deloitte.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	public AppController() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}
	
	@GetMapping("/getLoginPage")
	public String getLoginPage() {
		System.out.println("Invoked getLoginPage()");
		return "/WEB-INF/pages/Login.jsp";
	}
}
