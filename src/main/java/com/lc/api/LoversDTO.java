package com.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class LoversDTO {

	@NotBlank(message = " * name field cannot be blank")
	private String yourname;
	
	@NotEmpty(message = " * field cannot be empty")
	private String crushname;
	
	private String result;
	
	@AssertTrue(message = "Agree to the terms and conditions to gain access to using our app")
	private boolean termsAndCondition;

	public String getYourname() {
		return yourname;
	}

	public void setYourname(String yourname) {
		this.yourname = yourname;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(boolean termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}

	@Override
	public String toString() {
		return "Lovers [yourname=" + yourname + ", crushname=" + crushname + "]";
	}
	
	
}
