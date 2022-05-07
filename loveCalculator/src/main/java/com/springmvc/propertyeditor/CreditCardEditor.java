package com.springmvc.propertyeditor;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import com.pojoDTO.CreditCard;

public class CreditCardEditor extends PropertiesEditor{

	@Override
	public String getAsText() {
		CreditCard creditCard = (CreditCard) getValue();
		
		return "sample : " + creditCard;
	}
	
       @Override
    public void setAsText(String text) throws IllegalArgumentException {
    	
    	   System.out.println("parse formate method called");
   		CreditCard creditCard = new CreditCard();
   		String[] creditCardNumber = text.split("-");

   		creditCard.setFirstFourDigits(creditCardNumber[0]);
   		creditCard.setSecondFourDigits(creditCardNumber[1]);
   		creditCard.setThirdFourDigits(creditCardNumber[2]);
   		creditCard.setLastFourDigits(creditCardNumber[3]);
   		
   		setValue(creditCard);
    }

}
