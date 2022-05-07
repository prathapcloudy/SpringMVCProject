package com.modelattribute.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojoDTO.WebsiteInfoDTO;

@Controller
//@ControllerAdvice
public class TestController {
	
	@RequestMapping("/testInfo")
	public String testWebsiteInfo(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO, Model model) throws IOException {

		System.out.println("@model attribute : inside test info");
		
		if(1==1) {
			throw new IOException();
		}

		// WebsiteInfoDTO websiteInfoDTOO = (WebsiteInfoDTO)
		// model.getAttribute("websiteInfo");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCategory());

		return "model-attribute";
	}
	
	
	
	
	


}
