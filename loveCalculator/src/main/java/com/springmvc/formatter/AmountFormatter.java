package com.springmvc.formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.cglib.core.Local;
import org.springframework.format.Formatter;

import com.pojoDTO.Amount;

public class AmountFormatter implements Formatter<Amount> {

	@Override
	public String print(Amount object, Locale locale) {
		return null;
	}

	@Override
	public Amount parse(String amount, Locale locale) throws ParseException {

		System.out.println("amount formatter class callled");
		Amount amt = new Amount();
		
		String[] amtArray = amount.split(" ");
		
		Currency currency = Currency.getInstance(amtArray[1]);
		String symbol = currency.getSymbol();
		amt.setBillAmount(BigDecimal.TEN);
		amt.setLocaleDefinition(locale);
		
		return amt;
	}
}
