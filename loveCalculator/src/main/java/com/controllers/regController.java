package com.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojoDTO.Bill;
import com.pojoDTO.CommunicationDTO;
import com.pojoDTO.CreditCard;
import com.pojoDTO.Phone;
import com.pojoDTO.UserRegDTO;
import com.springframework.validator.EmailValidator;
import com.springframework.validator.UserNameValidator;
import com.springmvc.formatter.CreditCardFormatter;
import com.springmvc.formatter.CurrencyFormatter;
import com.springmvc.propertyeditor.CreditCardEditor;
import com.springmvc.propertyeditor.NamePropertyEditor;

@Controller
public class regController {

	@RequestMapping("/register")
	public String regPage(@ModelAttribute("userReg") UserRegDTO userRegDTO) {
		System.out.println("user registration method callled");
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("9943414617");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		userRegDTO.setCommunicationDTO(communicationDTO);
		
		return"reg-page";
	}
	
	@RequestMapping("/regProcess")
	public String regSuccessPage(@Valid @ModelAttribute("userReg") UserRegDTO userRegDTO, BindingResult result) {
	   System.out.println("user name is + " + "|" + userRegDTO.getName() + "|");
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			
			for(ObjectError tempe : allErrors) {
              System.out.println(tempe);				
			}
			return "reg-page";
		} else {
			return "reg-success";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields("name");
		System.out.println("inside the initbinder method");
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);
		
		//date format editor
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor= new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", customDateEditor);
		
		//NameProperty Editor
		NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,namePropertyEditor);
		
		//Adding creditcard formatter to binder
	    // binder.addCustomFormatter(new CreditCardFormatter());
//		CreditCardEditor creditCardEditor = new CreditCardEditor();
//		binder.registerCustomEditor(CreditCard.class, "creditCard", creditCardEditor);

		CurrencyFormatter currencyFormatter = new CurrencyFormatter();
		binder.registerCustomEditor(String.class, "currency", currencyFormatter);
		
		binder.addValidators(new UserNameValidator());
		binder.addValidators(new EmailValidator());
	}
	
	@RequestMapping("/generateBill")
	public String calculateBill(@ModelAttribute("bill") Bill billDto) {
		System.out.println("generate bill request method called");
		
//		CreditCard creditCard = new CreditCard();
//		creditCard.setFirstFourDigits("3434");
//		creditCard.setLastFourDigits("3483");
//		creditCard.setSecondFourDigits("3465");
//		creditCard.setThirdFourDigits("2893");
//		
//		billDto.setCreditCard(creditCard);
//		
      return"credit-card-page";		
	}
	
	@RequestMapping("/showBill")
	public String showBill(@ModelAttribute("bill") Bill billDto) {

		System.out.println("creditCard bill date is " + "|" + billDto.getDate() + "|");

		return "show-credit-bill";
	}
}
