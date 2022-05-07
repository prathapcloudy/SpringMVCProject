package com.springmvc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.pojoDTO.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		
		System.out.println("print method called");
		return phone.getCountryCode()+ "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		Phone phone = new Phone();
		String[] phoneNumArray = completePhoneNumber.split("-");

		int indexOf = completePhoneNumber.indexOf("-");

		if (indexOf == -1 || completePhoneNumber.startsWith("-")) {

			phone.setCountryCode("93");
			
			if(completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(phoneNumArray[1]);
			}else {
				phone.setUserNumber(phoneNumArray[0]);
			}
			
		} else {
			phone.setCountryCode(phoneNumArray[0]);
			phone.setUserNumber(phoneNumArray[1]);
		}
		return phone;
	}

}
