package com.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.pojoDTO.EmailDTO;
import com.pojoDTO.UserInfoDTO;
import com.springmvc.service.LCAppEmailService;
import com.springmvc.service.LCAppEmailServiceImpl;

@Controller
public class EmailController {
	
	//@Autowired
	LCAppEmailServiceImpl lcAppEmailService = new LCAppEmailServiceImpl();
	
	@RequestMapping("/sendEmail")
	public String sendEmail(/* @CookieValue("LcApp.userName") String userName, */@ModelAttribute("emailDTO") EmailDTO emailDTO, Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
		
		//setting the userName from the cookies  using @CookieValue annotation
		/*
		 * model.addAttribute("userName", userName); model.addAttribute("emailDTO", new
		 * EmailDTO());
		 */
		return "send-email-page";
	}
	
	@RequestMapping("/process-email")
	public String processEmail(
			/* @CookieValue("LcApp.userName") String userName, */@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,
			@ModelAttribute("emailDTO") EmailDTO emailDTO, HttpSession session, Model model) {

		lcAppEmailService.sendEmail(userInfoDTO.getUserName(),emailDTO.getUserEmail(), "result");		
		
//		String userName = (String)session.getAttribute("userName");
//		String uName = "Mr "+userName;
//		model.addAttribute("userName", uName);
		
		
		
		//setting the userName from the cookies  using @CookieValue annotation
		/*
		 * model.addAttribute("userName", userName); model.addAttribute("emailDTO", new
		 * EmailDTO());
		 */
		return "process-email";
	}
}
