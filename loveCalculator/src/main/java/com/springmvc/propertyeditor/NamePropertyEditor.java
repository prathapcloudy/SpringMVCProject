package com.springmvc.propertyeditor;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class NamePropertyEditor extends PropertiesEditor {
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String convertedString = text.toUpperCase();
		setValue(convertedString);
	}

}
