package com.pojoDTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " {nameNotEmpty}")
	@Size(min = 3, max = 15, message = "*Your Name should be 3-15 char")
	private String userName;
	
	@NotBlank(message = " *crush name cannot be null")
	@Size(min = 3, max = 15, message = "*crush Name should be 3-15 char")
	private String crushName;
	
	@AssertTrue(message = "agree to use our app")
	private boolean termAndCondition;
	
	private String result;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
