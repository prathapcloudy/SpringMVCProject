package com.sessionattribute.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"firstName","lastName"})
public class FirstController {
	
	@RequestMapping("/first")
	public String handlerMethod1(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("address", "chennai");

		model.addAttribute("firstName", "prathap");
		model.addAttribute("lastName", "devaraj");
		
		model.addAttribute("next", "second");
		return "first-session";
	}
	
	
	@RequestMapping("/second")
	public String handlerMethod2(Model model2) {
		
		String firstName = (String)model2.getAttribute("firstName");
		System.out.println(firstName);
		String lastName = (String)model2.getAttribute("lastName");
		System.out.println(lastName);
		
//		model2.addAttribute("firstName", firstName);
//		model2.addAttribute("lastName", lastName);
		
		model2.addAttribute("next", "third");
		//System.out.println(status.isComplete());
	
		return "first-session";
	}
	
	@RequestMapping("/third")
	public String handlerMethod3(Model model3, SessionStatus status, HttpSession session) {
		
		
		String address = (String) session.getAttribute("address");
		String newAddress = "welcome " + address;
		model3.addAttribute("address", newAddress);
		
		String lastName = (String)model3.getAttribute("lastName");
		System.out.println("Third request " + lastName);
		model3.addAttribute("lastName", lastName);
		model3.addAttribute("next", "normalMethod");
		status.setComplete();
		
		return "first-session";
	}

}
