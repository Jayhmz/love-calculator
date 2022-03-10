package com.lc.api;

import com.lc.annotationValidators.Mobile;

public class CommunicationDTO {

	private String Email;
	
	@Mobile
	private Phone phone;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
