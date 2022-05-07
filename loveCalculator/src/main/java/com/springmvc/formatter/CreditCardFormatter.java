package com.springmvc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.pojoDTO.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditCard parse(String creditCardDetails, Locale locale) throws ParseException {

		System.out.println("parse formate method called");
		CreditCard creditCard = new CreditCard();
		String[] creditCardNumber = creditCardDetails.split("-");

		creditCard.setFirstFourDigits(creditCardNumber[0]);
		creditCard.setSecondFourDigits(creditCardNumber[1]);
		creditCard.setThirdFourDigits(creditCardNumber[2]);
		creditCard.setLastFourDigits(creditCardNumber[3]);

		return creditCard;
	}

}
