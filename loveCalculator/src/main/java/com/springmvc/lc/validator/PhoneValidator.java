package com.springmvc.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.pojoDTO.Phone;
import com.springmvc.annotation.PhoneNumber;

public class PhoneValidator implements ConstraintValidator<PhoneNumber, Phone> {

	@Override
	public void initialize(PhoneNumber constraintAnnotation) {
		System.out.println("initialize method");
	}

	@Override
	public boolean isValid(Phone phoneNumber, ConstraintValidatorContext context) {

		System.out.println("phone number object class called");
		// String regex = "^\\d{10}$";
		if (phoneNumber == null) {
			return false;
		} else {
			return true;
		}
	}

}
