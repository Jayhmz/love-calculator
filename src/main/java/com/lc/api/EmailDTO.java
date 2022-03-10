package com.lc.api;

import javax.validation.constraints.NotBlank;

public class EmailDTO {

	@NotBlank
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
