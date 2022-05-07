package com.modelattribute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pojoDTO.WebsiteInfoDTO;

@Controller
@SessionAttributes("websiteInfo")
@ControllerAdvice(basePackages = "com.modelattribute.controller")
public class MyWebsiteController {

	@ModelAttribute("websiteInfo")
	public WebsiteInfoDTO getWebsiteInfo() {
		WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
		websiteInfoDTO.setWebsiteName("Devaraj Memories");
		websiteInfoDTO.setWebsiteCategory("General");

		return websiteInfoDTO;
	}

	@RequestMapping("/showInfo")
	public String showWebsiteInfo(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO, Model model) {

		System.out.println("@model attribute : inside show info");

		// WebsiteInfoDTO websiteInfoDTOO = (WebsiteInfoDTO)
		// model.getAttribute("websiteInfo");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCategory());
		return "model-attribute";
	}

	@RequestMapping("/showCompInfo")
	public String showCompanyInfo(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO, Model model) {
		System.out.println("*****************");
		System.out.println("Inside show company info");

		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCategory());

		System.out.println("*****************");
		return "model-attribute";
	}
	
}
