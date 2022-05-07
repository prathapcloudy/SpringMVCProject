package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pojoDTO.UserInfoDTO;
import com.springmvc.service.LCAppService;
import com.springmvc.service.LCAppServiceImpl;

@Controller
@SessionAttributes("userInfo")
public class LoveAPPController {
	
	//@Autowired
	 LCAppServiceImpl lcAppService = new LCAppServiceImpl();

	@RequestMapping("/email")
	public String showHomePage( Model model, HttpSession session) {
		model.addAttribute("userInfo", new UserInfoDTO());
		
//		String userName = (String)session.getAttribute("userName");
//		userInfoDto.setUserName(userName);
		
		
		//setting the values from cookies while page loading 
		/*Cookie[] theCookie = request.getCookies();
		
		 * for (Cookie temp : theCookie) { if("LcApp.userName".equals(temp.getName())) {
		 * 
		 * String myName = temp.getValue(); userInfoDto.setUserName(myName); } }
		 */
		return "home-page";
	}

	@RequestMapping("/emailProcess")
	public String showResultPage(Model model, @Valid UserInfoDTO userInfoDto, BindingResult result,
			HttpServletRequest request) {
		 model.addAttribute("userInfo", userInfoDto);
		 model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "userInfo", result);
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();

			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		} else {
			//adding cookei object
			/*
			 * Cookie theCookie = new Cookie("LcApp.userName", userInfoDto.getUserName());
			 * theCookie.setMaxAge(60 * 60 * 24); response.addCookie(theCookie);
			 */
			
			//creating seesion using hhtp seesion
//			HttpSession session = request.getSession();
//			session.setAttribute("userName", userInfoDto.getUserName());
			 String appResult =lcAppService.calculateLove(userInfoDto.getUserName(), userInfoDto.getCrushName());
			
			 userInfoDto.setResult(appResult);
			 model.addAttribute("result", appResult);
			
			return "email-process-page";
			
		}
	}
}
