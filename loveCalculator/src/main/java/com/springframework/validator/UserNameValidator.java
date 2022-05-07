package com.springframework.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pojoDTO.CommunicationDTO;
import com.pojoDTO.UserRegDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return UserRegDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User name can't be empty");

		String userName = ((UserRegDTO) object).getUserName();
		if (!userName.contains("-")) {
			errors.rejectValue("userName", "userName.invalid", "String must contain -");
		}

//		UserRegDTO email = ((UserRegDTO) object);
//
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty", "Email can't be empty");
//		if (!email.getCommunicationDTO().getEmail().contains("@seleniumexpress.com")) {
//			errors.rejectValue("email", "email.invalid", "email should be ending with @com");
//		}
	}

}
