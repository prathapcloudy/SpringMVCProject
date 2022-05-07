package com.springmvc.formatter;

import java.util.Currency;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class CurrencyFormatter extends PropertiesEditor {

	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		Currency currency = Currency.getInstance(text.toUpperCase());
		
		setValue(currency);
	}
}
