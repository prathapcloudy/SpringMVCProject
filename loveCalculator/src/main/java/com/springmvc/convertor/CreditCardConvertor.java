package com.springmvc.convertor;

import org.springframework.core.convert.converter.Converter;

import com.pojoDTO.CreditCard;

public class CreditCardConvertor implements Converter<String, CreditCard> {

	@Override
	public CreditCard convert(String source) {
		
		CreditCard creditCard = new CreditCard();
		String[] creditCardNumber = source.split("-");

		creditCard.setFirstFourDigits(creditCardNumber[0]);
		creditCard.setSecondFourDigits(creditCardNumber[1]);
		creditCard.setThirdFourDigits(creditCardNumber[2]);
		creditCard.setLastFourDigits(creditCardNumber[3]);

		return creditCard;
	}

}
