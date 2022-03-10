package com.lc.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.lc.annotationValidators.Age;
import com.lc.annotationValidators.Mobile;

public class UserRegistrationDTO {

	@NotBlank(message = " * Name field cannot be blank")
	private String name;
	@NotBlank(message = " * Username field cannot be blank")
	@Size(min = 3, message = " * Username should be of at least 4 characters")
	private String username;
	@Age(minimum = 20, maximum = 76)
	private Integer age;
	private String country;
	private String gender;
	private char[] password;
	private String[] hobbies;

	@Valid
	private CommunicationDTO communicationDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

}
