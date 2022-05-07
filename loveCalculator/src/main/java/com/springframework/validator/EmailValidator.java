package com.springframework.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pojoDTO.CommunicationDTO;
import com.pojoDTO.UserRegDTO;

public class EmailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
	
	String email = ((UserRegDTO)target).getCommunicationDTO().getEmail();
	if(!email.contains("@SELENIUMEXPRESS.COM")) {
		errors.rejectValue("communicationDTO.email", "communicationDTO.email.invalid");
	}
		
	}

}
