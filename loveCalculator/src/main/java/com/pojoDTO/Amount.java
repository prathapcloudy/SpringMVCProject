package com.pojoDTO;

import java.math.BigDecimal;
import java.util.Locale;

public class Amount {

	private BigDecimal billAmount;
	private Locale localeDefinition;

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	
	@Override
	public String toString() {
		return getBillAmount() + "" + getLocaleDefinition();
	}

	public Locale getLocaleDefinition() {
		return localeDefinition;
	}

	public void setLocaleDefinition(Locale localeDefinition) {
		this.localeDefinition = localeDefinition;
	}

	
	
	

}
