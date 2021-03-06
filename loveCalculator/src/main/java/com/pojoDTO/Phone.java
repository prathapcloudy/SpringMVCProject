package com.pojoDTO;

import com.springmvc.annotation.PhoneNumber;


public class Phone {

	@PhoneNumber
	private String countryCode;
	@PhoneNumber
	private String userNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return getCountryCode() +"-"+getUserNumber();
	}
	
	
	
}
