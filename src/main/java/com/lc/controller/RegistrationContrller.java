package com.lc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lc.api.CommunicationDTO;
import com.lc.api.Phone;
import com.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationContrller {

	@GetMapping("/register")
	public String showRegistrationPage(@ModelAttribute("user") UserRegistrationDTO dto) {

		Phone phone = new Phone();
		phone.setCountryCode("99");
		phone.setUserNumber("56789024");
		
		CommunicationDTO cdto = new CommunicationDTO();
		cdto.setPhone(phone);
		
		dto.setCommunicationDTO(cdto);
		return "register";
	}

	@PostMapping("/process-registration")
	public String processRegistration(@Valid @ModelAttribute("user") UserRegistrationDTO dto, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println(result);
			return "register";
		}
		return "success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside the binder method");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(getClass(), editor);
		
//		binder.setDisallowedFields("password");
	}

}
