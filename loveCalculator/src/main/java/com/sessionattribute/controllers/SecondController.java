package com.sessionattribute.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SecondController {

	@RequestMapping("/normalMethod")
	public String handlerMethod3(HttpSession session ,Model model) {
		
		String addressNew = (String)session.getAttribute("address");
		String newAddress = "Hi " +addressNew;
		model.addAttribute("address", newAddress);

		// String lname = (String)model.getAttribute("lastName");
//		String name = "Mr " + lastName;
//		model.addAttribute("lastName", name);
		// System.out.println("inside the normal method " + lname);
		// model3.addAttribute("lastName", lastName);

		return "first-session";
	}
}
